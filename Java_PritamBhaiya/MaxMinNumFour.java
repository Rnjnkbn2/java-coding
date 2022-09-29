
//package Java_PritamBhaiya;
import java.util.*;

public class MaxMinNumFour {
    public static void max(int a, int b, int x, int y){
        if(a>b && a>x && a>y){
            System.out.println(a+" maximum value number");
        }
        else if (b>a && b>x && b>y){
            System.out.println(b+" maximum value number");
        }
        else if (x>a && x>b && x>y){
            System.out.println(x+" maximum value number");
        }
        else{
            System.out.println(y+" maximum value number");
        }
    }

    public static void min (int a, int b, int x, int y) {
        if (a < b && a < x && a < y) {
            System.out.println(a + " minimum value number");
        } else if (b < a && b < x && b < y) {
            System.out.println(b + " minimum value number");
        } else if (x < a && x < b && x < y) {
            System.out.println(x + " minimum value number");
        } else {
            System.out.println(y + " minimum value number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        max(a, b, x, y);
        min(a, b, x, y);
    }
}
