
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца:");

        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце  30 дней.");
                break;
            case 2:
                System.out.println("В этом месяце 28 дней.");
                break;
            default:
                System.out.println("Неверный номер месяце.");
        }
    }
}


