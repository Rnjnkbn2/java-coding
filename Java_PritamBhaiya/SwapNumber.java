//package Java_PritamBhaiya;

public class SwapNumber { 
    public static void SwapNum (int a ,int b){
        int temp=a;
        a=b; 
        b=temp;
       System.out.println("a: "+a);
       System.out.println("b: "+b);
    }
    public static void main(String[] args) {
       int a=12 , b=64;
        SwapNum(a,b);
        
    }
    
}
