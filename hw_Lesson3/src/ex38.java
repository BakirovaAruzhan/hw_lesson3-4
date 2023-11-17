import java.util.Scanner;

public class ex38 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Напишите первое число");
        int firstNumb = scanner.nextInt();

        System.out.println("Напишите второе число");
        int secondNumb = scanner.nextInt();

        System.out.println("Напишите третье число");
        int thirdNumb = scanner.nextInt();

        if (firstNumb<= secondNumb&& secondNumb<=thirdNumb){
            System.out.println("Числа указаны в порядке возрастания.");
        } else if (firstNumb>= secondNumb && secondNumb>=thirdNumb ){
            System.out.println("Числа указаны в порядке убывания");
        } else {
            System.out.println("Числа расположены хаотично");
        }
    }

}
