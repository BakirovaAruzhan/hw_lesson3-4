import java.util.Scanner;
class ex28 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите длину угла А:");
        int ugolA = scanner.nextInt();

        System.out.println("Напишите длину угла B:");
        int ugolB = scanner.nextInt();

        System.out.println("Напишите длину угла C:");
        int ugolC = scanner.nextInt();

        if (ugolA > 0 && ugolB > 0 && ugolC > 0) {
            if
            (ugolA + ugolB + ugolC == 180) {

                System.out.println("Треугольник допустим.");
            } else {
                System.out.println("Недопустимый треугольник");
            }
        }
    }
}

//списали с Лессон 2 ех15 которую я писал ДО
/*30. Write a program to check whether a triangle is valid or not,
when the three angles of the triangle are entered through the keyboard. A
 triangle is valid if the sum of all the three angles is equal to 180
degrees*/