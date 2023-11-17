import com.sun.source.tree.IfTree;

import java.util.Scanner;
public class ex27{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите возраст Рама:");
        int ageofRam = scanner.nextInt();

        System.out.println("Напишите возраст Шьяма:");
        int ageofShyam = scanner.nextInt();


        System.out.println("Напишите возраст Аджая:");
        int ageofAjay = scanner.nextInt();

        if (ageofAjay <= ageofRam && ageofAjay <= ageofShyam) {
            System.out.println("Аджай мелкий.");
        } else if (ageofRam <= ageofAjay && ageofRam <= ageofShyam) {
            System.out.println("Рам мелкий");
        } else {
            System.out.println("Шьяма мелкий");
        }

    }
}

/*29. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three*/











