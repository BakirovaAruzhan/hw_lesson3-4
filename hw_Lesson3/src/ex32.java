import java.util.Scanner;
class ex32 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите количество заддежки вовзатра книги: ");
        int daysLate = scanner.nextInt();
        int penalty = calculationPenalty(daysLate);

        System.out.println("Штраф состаявляет:" + penalty+ "KZT");
    }


    static int calculationPenalty(int daysLate) {
        if (daysLate <= 5) {

            return daysLate * 10;
        } else if (daysLate <= 10) {
            return 50 + (daysLate - 5) * 20;
        } else if (daysLate <= 30) {
            return 150 + (daysLate - 10) * 50;
        } else System.out.println("Ваше членство аннулировано.");
        return  0;
    }
}
/*
ex34
 */






