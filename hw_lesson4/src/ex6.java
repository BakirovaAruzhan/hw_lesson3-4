import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер единицы массы (1–5): ");
        int unit = scanner.nextInt();

        System.out.print("Введите массу тела в этой единице: ");
        double mass = scanner.nextDouble();
        double kilograms = 0;

        switch (unit) {
            case 1:
                kilograms = mass;
                break;
            case 2:
                kilograms = mass / 1000000;
                break;
            case 3:
                kilograms = mass / 1000;
                break;
            case 4:
                kilograms = mass * 1000;
            case 5:
                kilograms = mass * 100;
                break;
            default:
                System.out.println("Неверная единица массы");
                return;
        }

        System.out.println("Масса тела в килограммах:" + kilograms);
    }
}



