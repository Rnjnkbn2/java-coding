import java.util.Scanner;
public class Test{

    public static void main(String []args){
      Scanner s =new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int addition = sum(a, b);
      System.out.println("Sum of two number is ==>  " + addition);
      // table(a);
    }

    public static int sum(int a , int b){

      if(true){
        
      }
        int c = a + b;
        return c;
    }

    public static void table(int a){
      for(int i =1; i <= 10 ; i++){
        System.out.println("Table of   " + a + " " + i*a);
      }
      
  }
}