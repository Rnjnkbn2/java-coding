// package java.PritamBhaiya;
//package Java_PritamBhaiya;
import java.util.*;

public class MaxMinNum {
    public static void maxMinNum(int a, int b, int c){
        while ((a<b && a<c)||(a>b && a>c)){
            if(a<b){
                System.out.println(a+" is minimum number");
            }
            else{
                System.out.println(a+" is maximum number");
            }
            break;
        }
        while ((b<a && b<c)||(b>a && b>c)){
            if(b<a){
                System.out.println(b+" is minimum number");
            }
            else{
                System.out.println(b+" is maximum number");
            }
            break;
        }
        while((c<a && c<b)||(c>a && c>b)){
            if(c<a){
                System.out.println(c+" is minimum number");
            }
            else{
                System.out.println(c+" is maximum number");
            }
            break;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            maxMinNum(a,b,c);
        }
    }

    
}
