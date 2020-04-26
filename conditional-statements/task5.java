package task5;


import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("ОЦЕНКА: ");
        int a = in.nextInt();

        if ((a >= 0) && (a <= 19))
        {
            System.out.println("Оценка F");
        }
        if ((a >= 20) && (a <= 39))
        {
            System.out.println("Оценка E");
        }
        if ((a >= 40) && (a <= 59))
        {
            System.out.println("Оценка D");
        }
        if ((a >= 60) && (a <= 74))
        {
            System.out.println("Оценка C");
        }
        if ((a >= 75) && (a <= 89))
        {
            System.out.println("Оценка B");
        }
        if ((a >= 90) && (a <= 100))
        {
            System.out.println("Оценка A");
        }
    }
}
