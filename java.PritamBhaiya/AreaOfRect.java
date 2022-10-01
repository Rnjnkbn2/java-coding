// package java.PritamBhaiya;
//package Java_PritamBhaiya;
import java.util.*;
public class AreaOfRect {
    public static int area(int length , int width){
        int area=length *width;
        System.out.println("Area of Ractangle: "+area);
        return 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int length = sc.nextInt();
            int width = sc.nextInt();
            area(length, width);
        }

    }
    
}
