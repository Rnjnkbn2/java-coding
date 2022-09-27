//package java-coding.Java Basics;
public class Fizzbuzz {
    public static void main(String[] args) {
        for(int a=0;a<=100;a++){
            if(a%3==0 && a%5==0){
            System.out.println("fizzbuzz");
            }else if(a%3==0){
                System.out.println("fizz");
            }
            else if(a%5==0){
                System.out.println("buzz");
            }
        }
    }

        
}

