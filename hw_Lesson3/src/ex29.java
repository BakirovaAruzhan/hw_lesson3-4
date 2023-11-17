import java.util.Scanner;
class ex29 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите число:");
        int number = scanner.nextInt();

        number = Math.abs(number);
        System.out.println("Абсолютное число:" + number + ".");
    }
}

/*
31. Find the absolute value of a number entered through the keyboard
 */

