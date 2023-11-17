import java.util.Scanner;
//ex26
public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Age:");
        int age = scanner.nextInt();

        System.out.println("Enter the Gender M/F:");
        char gender = scanner.next().charAt(0);


        System.out.println("Enter the Marital Status U/M:");
        char materialS = scanner.next().charAt(0);


        if ((age >= 25 && age <= 30) && (gender == 'F' || gender == 'M') && (materialS == 'U' || materialS == 'M')) {
            System.out.println("Введены некорректные данные");
        }
        if (materialS == 'U' || gender == 'M' || age <= 30) {
            System.out.println("The driver must be insured");

        } else if (materialS == 'U' || gender == 'M' || age <= 30) {
            System.out.println("The driver must be insured");

        } else if (materialS == 'U' || gender == 'F' || age <=25) {

        } else if (materialS == 'M') {
            System.out.println("The driver must be insured");
        } else {
            System.out.println("Driver shoud not be insured");
        }
    }
}

/*26. A company insures its drivers in the following cases:**

 - If the driver is married
 - If the driver is unmarried, male & above 30 years of age
 - If the driver is unmarried, female & above 25 years of age

 */
