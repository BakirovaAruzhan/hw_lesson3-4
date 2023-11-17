import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число в диапазоне 1–4:");
        int a = scanner.nextInt();
        System.out.println("Укажите номер действия(1+. 2-. 3-*. 4-/.): ");
        int symbol = scanner.nextInt();
        System.out.println("Введите целое число в диапазоне 1–4:");
        int b = scanner.nextInt();
        double res = 0;

        switch (symbol){
            case 1:
                res= a+b;
                break;
            case 2:
                res = a - b;
                break;
            case 3:
                res = a * b;
                break;
            case 4:
                if (b==0){
                    System.out.println("Деление на ноль запрещено.");
                }
                res = a / b;
                break;
            default:
                System.out.println("Не верный номер дейсвия.");
        }

        System.out.println("Результат:" + res);




    }


}


