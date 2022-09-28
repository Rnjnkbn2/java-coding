package Recursion;

import java.util.*;

import javax.sound.midi.Sequencer.SyncMode;

public class Factorial {

    public static int fact(int num){
        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        System.out.println("factorisl of "+f+" is = "+fact(f));
         


    }
    
}
