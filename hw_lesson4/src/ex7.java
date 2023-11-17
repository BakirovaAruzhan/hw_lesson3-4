import java.util.Scanner;
public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента окружности (1–4):");
        int unit = scanner.nextInt();

        System.out.println("Введите значение этого элемента:");
        double value = scanner.nextDouble();

        double radius = 0;
        double diameter = 0;
        double length = 0;
        double area = 0;

        switch (unit) {
            case 1:
                radius = value;
                diameter = 2 * radius;
                length = 2 * Math.PI * radius;
                area = Math.PI * radius * radius;
                break;
            case 2:
                diameter = value;
                radius = diameter / 2;
                length = 2 * Math.PI * radius;
                area = Math.PI * radius * radius;
                break;
            case 3:
                length = value;
                radius = length / (2 * Math.PI);
                diameter = 2 * radius;
                area = Math.PI * radius * radius;
                break;
            case 4:
                area = value;
                radius = Math.sqrt(area / Math.PI);
                diameter = 2 * radius;
                length = 2 * Math.PI * radius;
                break;
            default:
                System.out.println("Неверный номер элемента окружности");
                return;
        }

        System.out.println("Радиус:" + radius);
        System.out.println("Диаметр" + diameter);
        System.out.println("Длина окружности:" +length);
        System.out.println("Площадь круга:" +area);
    }
}







