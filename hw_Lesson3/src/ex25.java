import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Gender M/F:");
        char gender = scanner.next().charAt(0);

        System.out.println("Enter your work experience:");
        int year = scanner.nextInt();

        System.out.println("Enter education (G/P):");
        char education = scanner.next().charAt(0);

        if(gender== 'M'){
            if (year>=10 && education=='G'){
                System.out.println("Зарплата-7000KZT.");
            } else if (year<10 && education=='P')
                System.out.println("Зарплата -10 000KZT");
            } else if (year<10 && education=='G') {
            System.out.println("Зарплата -7 000KZT");
        } else if (year>=10 && education=='P'){
            System.out.println("Зарплата не положена.");
        } else System.out.println("Try again!");

        if (gender=='F'){
            if (year>10 && education=='P'){
                System.out.println("Зарплата -12 000KZT");
            } else if(year>=10&& education=='P'){
                System.out.println("Зарплата -9 000KZT");
            } else if (year<10&& education=='P'){
                System.out.println("Зарплата -10 000KZT");
            } else if(year<10&& education=='G'){
                System.out.println("Зарплата -6 000KZT");
            } else
                System.out.println("Try again!");
        }
    }
}





