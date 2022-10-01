// package java.PritamBhaiya;
// package Java_PritamBhaiya;
import java.util.*;
public class VolOfCuboid {
    public static int volume(int length, int width, int height){
        int volume = length*width*height;
        System.out.println("Volume of cuboid :"+volume);
        return 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int length = sc. nextInt();
            int width = sc. nextInt();
            int height = sc. nextInt();
            volume(length, width, height);
        }
        
    }
    
}
