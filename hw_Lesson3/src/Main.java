import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите полученный балл по Физике :");
        int physics = scanner.nextInt();
        System.out.println("Введите полученный балл  по Химии:");
        int chemistry = scanner.nextInt();
        System.out.println("Введите полученный балл  по Биологии:");
        int biology = scanner.nextInt();
        System.out.println("Введите полученный балл  по Математики:");
        int math = scanner.nextInt();
        System.out.println("Введите полученный балл  по Информатике:");
        int computer = scanner.nextInt();
        int res = (physics + chemistry + biology + math + computer) *100;
        int res2 = res /500;
        int totalPercentage = res2;

        if (40<60) {
            if (totalPercentage >= 60) {
                System.out.println("Первый дивизион");
            } else if (50 < 60) {
                System.out.println(" Второй дивизион");
            } else if (40 < 49) {
                System.out.println("Третий дивизион");
            } else if (totalPercentage >= 60) {
            } else {
                System.out.println("Провал");
            }
        }
    }

}
/*
**25. The marks obtained by a student in 5 different subjects are
input through the keyboard. The student gets a division as per the
following rules: Write a program to calculate the division obtained by
the student**

- Percentage above or equal to 60 - First division
- Percentage between 50 and 59 - Second division
- Percentage between 40 and 49 - Third division
- Percentage less than 40 – Fail
 */