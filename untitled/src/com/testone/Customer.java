package com.testone;

public class Customer {
    private int id;
    private String custName;
    private String custAAdhar;
    private String custPan;
    private String custRation;

    private Address addess;

    public Address getAddess() {
        return addess;
    }

    public void setAddess(Address addess) {
        this.addess = addess;
    }

    public Customer(int id, String custName, String custAAdhar, String custPan, String custRation, Address addess) {
        this.id = id;
        this.custName = custName;
        this.custAAdhar = custAAdhar;
        this.custPan = custPan;
        this.custRation = custRation;
        this.addess = addess;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAAdhar() {
        return custAAdhar;
    }

    public void setCustAAdhar(String custAAdhar) {
        this.custAAdhar = custAAdhar;
    }

    public String getCustPan() {
        return custPan;
    }

    public void setCustPan(String custPan) {
        this.custPan = custPan;
    }

    public String getCustRation() {
        return custRation;
    }

    public void setCustRation(String custRation) {
        this.custRation = custRation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", custName='" + custName + '\'' +
                ", custAAdhar='" + custAAdhar + '\'' +
                ", custPan='" + custPan + '\'' +
                ", custRation='" + custRation + '\'' +
                ", addess=" + addess +
                '}';
    }
}
