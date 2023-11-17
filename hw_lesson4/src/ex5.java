import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите единицу длины (д, км, м, m(мм), см): ");
        char unit = scanner.next().charAt(0);

        System.out.print("Введите длину отрезка: ");
        double length = scanner.nextDouble();
        double meters = 0;

        switch (unit) {
            case 'д':
                meters = length * 10;
                break;
            case 'к':
                meters = length / 1000;
                break;
            case 'м':
                meters = length;
                break;
            case 'm':
                meters = length / 1000;
                break;
            case 'с':
                meters = length / 100;
                break;
            default:
                System.out.println("Неверная единица длины");
                ;
        }

        System.out.println("Длина отрезка в метрах: " + meters);
    }
}

