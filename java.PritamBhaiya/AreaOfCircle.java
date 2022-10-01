// package java.PritamBhaiya;
//package Java_PritamBhaiya;
import java.util.*;
public class AreaOfCircle {
    public static int area(int radius){
      double area = 3.147*radius*radius;
      System.out.println("Area of circle is "+area);
      return 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          int radius = sc.nextInt();
          area(radius);
        }
    }
    
}
