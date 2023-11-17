import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gender (m/f): ");
        String input = scanner.nextLine();

        char gender = input.toLowerCase().charAt(0);

        switch (gender) {
            case 'm':
                System.out.println("Мужчина");
                break;
            case 'f':
                System.out.println("Женщина");
                break;
            default:
                System.out.println("Invalid gender entered. Please enter 'm' for male or 'f' for female.");
        }
    }
}