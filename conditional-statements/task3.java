package task3;

public class task3 {
    public static void main(String[] args) {
        int a = 1;
        int b = -5;
        int c = 6;
        if((a > 0) && (b > 0) && (c > 0))
        {
            System.out.println(a + b + c);
        }
        if ((a > 0) && (b > 0) && (c < 0))
        {
            System.out.println(a + b);
        }
        if ((a > 0) && (b < 0) && (c > 0))
        {
            System.out.println(a + c);
        }
        if ((a < 0) && (b < 0) && (c > 0))
        {
            System.out.println(b + c);
        }
    }
}
