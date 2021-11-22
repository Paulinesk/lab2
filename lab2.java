// использование цикла for
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab2 {
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
        } else {
            System.out.println("n должно быть меньше 15");
            return;
        }
        int c = 1;
        for(int i=0; i<n; i++) c*=x;
        System.out.println(c);
    }
}