import java.util.Scanner;

class ex36 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Напишите второе число:");
        int number2 = scanner.nextInt();

        System.out.println("Напишите третье число:");
        int number3 = scanner.nextInt();

        if ((number1 == number2) && (number2 == number3)) {
            System.out.println("Все числа равны");
        } else {
            System.out.println("Заданные числа не равны");
        }
    }
}
