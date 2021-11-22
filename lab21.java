//использование цикла for
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        try {
            System.out.println("Введите x: ");
            x = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        int n = 0;
        try {
            System.out.println("Введите n: ");
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        if (n < 15) {
            do {
                System.out.printf("%.0f \n", Math.pow(x, n));
                break;
            } while (n < 15);
        } else {
            System.out.println("n должно быть меньше 15.");
        }
    }
}

