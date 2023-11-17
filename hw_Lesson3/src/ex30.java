import java.util.Scanner;
class ex30 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите длину прямоугольника:");
        int dlina = scanner.nextInt();

        System.out.println("Напишите ширину прямоугольника:");
        int shyrina = scanner.nextInt();

        int ploshad = dlina * shyrina;

        int perimetr = 2 * (dlina + shyrina);

        if (ploshad > perimetr) {
            System.out.println("Площадь прямоугольника больше чем его периметр");
        } else if (perimetr<ploshad){
            System.out.println("Периметр прямоугольника больше чем его периметр");
        } else System.out.println("Площадь и периметр прямоугольника равны.");
    }
}
