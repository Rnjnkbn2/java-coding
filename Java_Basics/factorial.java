
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int no = s.nextInt();
            int temp;
            int fact=1;
            for (int i = no; i > 1; i--) {
                temp = i;
                fact=fact*temp;
            }
            System.out.println(fact);
        }

    }

}
