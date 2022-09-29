// package Java_PritamBhaiya;

import java.util.Scanner;

public class AvgOf_ThreeNo {
    public static double avg (int a, int b, int c){
        double avg = (a+b+c)/3.0;
        System.out.println("Average of Three no."+avg);
        return avg ;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a, b, c);
    }
    
}
