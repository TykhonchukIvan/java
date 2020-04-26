package task2;

public class task2 {
    public static void main(String[] args) {
        int x = -10;
        int y = -10;
        if ((x > 0) && (y > 0))
        {
            System.out.println("Точка в первой координатной четверти");
        }
        if ((x < 0) && (y > 0))
        {
            System.out.println("Точка в второй координатной четверти");
        }
        if ((x < 0) && (y < 0))
        {
            System.out.println("Точка в третьей координатной четверти");
        }
        if ((x > 0) && (y < 0))
        {
            System.out.println("Точка в четвертой координатной четверти");
        }
    }
}
