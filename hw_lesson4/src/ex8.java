
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер элемента треугольника (1–4): ");
        int unit = scanner.nextInt();

        System.out.print("Введите значение этого элемента: ");
        double value = scanner.nextDouble();

        double a = 0;
        double c = 0;
        double h = 0;
        double S = 0;

        switch (unit) {
            case 1:
                a = value;
                c = a * Math.sqrt(2);
                h = c / 2;
                S = c * h / 2;
                break;
            case 2:
                c = value;
                a = c / Math.sqrt(2);
                h = c / 2;
                S = c * h / 2;
                break;
            case 3:
                h = value;
                c = 2 * h;
                a = c / Math.sqrt(2);
                S = c * h / 2;
                break;
            case 4:
                S = value;
                c = 2 * S / h;
                a = c / Math.sqrt(2);
                h = 2 * S / c;
                break;
            default:
                System.out.println("Неверный номер элемента треугольника");
                return;
        }

        System.out.println("Катет a:" + a);
        System.out.println("Гипотенуза с:" + c);
        System.out.println("Высота h: "+ h);
        System.out.println("Площадь S:" +S);

    }
}











