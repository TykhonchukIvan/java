
package task4;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number1: ");
        int a = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a number2: ");
        int b = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input a number3: ");
        int c = in.nextInt();

        if ((a + b + c) > (a * b * c))
        {
            System.out.println((a + b + c) * 3);
        }
        else
        {
            System.out.println((a * b * c) * 3);
        }





    }
}
