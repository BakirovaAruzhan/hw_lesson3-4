import java.util.Scanner;
//ex35
public class ex34 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите предположительно потраченное время на конкретную задачу:");
        int timeSpend = scanner.nextInt();
        String effectiveness = callcOfEFF(timeSpend);

        System.out.println("Оценка вашей эффективности выдало:" + effectiveness+ ".");
    }


    static String callcOfEFF (int timeSpend ){
        if (timeSpend<3){
            return "Вы обладаете высокой эффективностью";
        } else if (timeSpend<4) {
            return "Просим  увеличить скорость.";
        } else if (timeSpend<5) {
            return " Работник проходит обучение для повышения своей скорости";
        } return "Работник должен покинуть компанию";


    }


    }
    

