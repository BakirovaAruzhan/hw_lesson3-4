import java.util.Scanner;
class ex31 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите твердость стали:");
        int hardness = scanner.nextInt();

        System.out.println("Введите содержание углерода в стали:");
        int carbonContent = scanner.nextInt();

        System.out.println("Введите предел прочности при растяжении стали:");
        int ultimateStrength = scanner.nextInt();
        int grade = 0;


        if (hardness > 50 && carbonContent < 0.7 && ultimateStrength >5600){
            grade= 10;
        } else if (hardness > 50 && carbonContent<0.7) {
            grade = 9;
        } else if (carbonContent<0.7 && ultimateStrength>5600) {
            grade = 8;
        } else if (hardness>50 && ultimateStrength>5600) {
            grade = 7;
        } else if (hardness >50 || carbonContent < 0.7 || ultimateStrength>5600) {
            grade = 6;

        }
        System.out.println(" Оценка марки стали:" + grade + ".");

    }
}
//33. Определенная марка стали классифицируется по следующим условиям: