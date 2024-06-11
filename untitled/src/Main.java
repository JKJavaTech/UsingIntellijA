// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Create  an array

        int number[]=new int[3];
        number[0]=1;
        number[1]=2;
        number[2]=3;

        //using normal for loop
        System.out.println("Using Normal for loop");
        for(int i=0;i< number.length;i++){
            System.out.println(number[i]);
        }

        //using enhance for each loop
        System.out.println("Using Enhance For Each loop");
        for(int n:number){
            System.out.println(n);
        }

        //using index you can access
        System.out.println("Using Index");
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);

    }
}