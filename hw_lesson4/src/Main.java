import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");
        int digit = scanner.nextInt();

        switch (digit) {
            case 1, 2, 3:
                System.out.println("Зима");
                break;
            case 4, 5, 6:
                System.out.println("Весна");
            case 7, 8, 9:
                System.out.println("Лето");
                break;
            case 10, 11, 12:
                System.out.println("осень");
                break;
            default:
                System.out.println("Нужно ввести число от 1-12!");
        }
    }
}
