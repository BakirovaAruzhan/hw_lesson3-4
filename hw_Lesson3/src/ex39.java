import javax.crypto.KEM;
import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Напишите число");
        int digit = scanner.nextInt();

        if (digit % 5 == 0) {
            System.out.println("Число делиться на  5.");
        } else {
            System.out.println("Число не делиться на 5.");
        }

    }
}

