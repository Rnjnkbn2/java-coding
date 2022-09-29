//package Java_PritamBhaiya;

public class SumNumber {
    public static int sum(int a, int b){
        int sum=a+b; 
        return sum;
      }
      public static void main(String[] args) {
        try{
          int a=15;
          int b=56;
          int sum;
          sum=sum(a, b);
          System.out.println("sum of "+a+" and "+b+" is:"+sum);
        }catch(Exception e){return;}
      }
}
