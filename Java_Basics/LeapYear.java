
// package java-coding.Java Basics;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {        
        try (Scanner s = new Scanner(System.in)) {
            int year = s.nextInt();
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("year is leap year:" + year);
                } else {
                    System.out.println("year is not leap year:" + year);
                }
            } 
            else {
                if (year % 4 == 0) {
                    System.out.println("year is leap year:" + year);
                }
                else{
                     System.out.println("year is not leap year:"+year);
                }
   
            }
        }
    }
}