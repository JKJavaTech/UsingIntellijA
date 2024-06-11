package com.example.empapp.controller;

import com.example.empapp.dto.EmpAddBean;
import com.example.empapp.model.Address;
import com.example.empapp.model.EmpBean;
import com.example.empapp.usingFeignclient.UsingFeighImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {

    private static List<EmpBean> empList = new ArrayList<EmpBean>();
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UsingFeighImpl usingFeighImpl;
    @Autowired
    private EurekaDiscoveryClient eurekaDiscoveryClient;

    public void getInstanceData(){
        List<String> getSerivces=eurekaDiscoveryClient.getServices();
        System.out.println("GetServices "+getSerivces);
        List<ServiceInstance> empApp = eurekaDiscoveryClient.getInstances("addApp");
        for(ServiceInstance si:empApp){
            System.out.println(si.getInstanceId());
            System.out.println(si.getUri());
            System.out.println(si.getHost());
            System.out.println(si.getPort());
            System.out.println(si.getServiceId());
        }

        int order=eurekaDiscoveryClient.getOrder();
        System.out.println(order);
    }



    @GetMapping("/getWishMsg")
    public String getData(){
        getInstanceData();
        return "Hello Welcome to Empcontroller";
    }

    @PostMapping("/createStudent")
    public List<EmpBean> getEmpList(@RequestBody EmpBean empBean){
        empList.add(empBean);
        return empList;
    }

    @GetMapping("/getStudentByid/{id}")
    public EmpBean getEmpBean(@PathVariable int id){
        return empList.stream().filter((empBean)->empBean.getEmp_id()==id).findAny().get();
    }

    @GetMapping("/getAddData/{id}")
    public EmpAddBean getDataFromanotherMicro(@PathVariable int id){
        System.out.println("GetId "+id);
        final Address[] address = {null};
        List<ServiceInstance> getServiceInstance = eurekaDiscoveryClient.getInstances("addApp");
        getServiceInstance.forEach(
                (serviceInstance)->{
                    System.out.println(serviceInstance.getInstanceId());
                    System.out.println(serviceInstance.getUri());
                    System.out.println(serviceInstance.getHost());
                    System.out.println(serviceInstance.getPort());
                    System.out.println(serviceInstance.getServiceId());
                    address[0] = restTemplate.getForEntity(serviceInstance.getUri() + "/address/getDatabyId/" + id, Address.class).getBody();
                }
        );

        System.out.println("Get the Address Object "+ address[0].getAddId());
        EmpBean empBean=getEmpBean(id);
        EmpAddBean empAddBean=new EmpAddBean(empBean.getEmp_id(),empBean.getEmp_name(), address[0].getStreetName(), address[0].getCountry());
        System.out.println("Get The Address Object "+ empBean.getEmp_id());
        return empAddBean;
    }

    @GetMapping("/getFeign/{id}")
    public EmpAddBean getDataUsingFeign(@PathVariable int id){
      Address address=usingFeighImpl.getAddress(id);
      System.out.println("get Address "+address);
      EmpBean empBean=getEmpBean(id);
      EmpAddBean empAddBean=new EmpAddBean(empBean.getEmp_id(),empBean.getEmp_name(),address.getStreetName(),address.getCountry());
      return empAddBean;
    }


}
