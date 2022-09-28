//package java-coding.Java Basics;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
     Scanner s =new Scanner(System.in);
     int no =s.nextInt();
     int temp=no;
     int reverseno=0;
     int rem;
     while(no !=0){
        rem=no%10;
        reverseno=reverseno*10+rem;
        no=no/10;
     }
     if (temp==reverseno){
        System.out.println(temp+" is pelindrome number");
     }
     else{
        System.out.println(temp+" is not a pelindrome number");
     }

    }   
}
