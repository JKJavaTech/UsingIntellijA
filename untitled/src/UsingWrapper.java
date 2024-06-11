public class UsingWrapper {

    public static void main(String[] args) {

        String name[]={"firstName","secondName","thirdName"};

        Integer test[]={22,33,44,55};

        System.out.println("Using Wrapper class objects");

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        System.out.println("Using Wrapper class objects");
        for(Integer i:test){
            System.out.println(i);
        }
    }
}
