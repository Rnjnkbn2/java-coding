// package java-coding.Java Basics;
public class Fibonacci {
    public static void main(String[] args) {
        int no1 = 0;
        int no2 = 1;
        int no3;
        for (int i = 0; i < 10; i++) {
            no3 = no1 + no2;
            no1 = no2;
            no2 = no3;
            System.out.println(no3);
        }

    }
}
