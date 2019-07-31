package MidExamPrep.DemoTechnologyFundamentalsMidExam02March2019;

import java.util.Scanner;

public class P1CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        int freePackages = students / 5;
        double neededMoney = apronPrice * Math.ceil(students * 1.2) +
                eggPrice * 10 * (students) + flourPrice * (students - freePackages);

        if (neededMoney > budget) {
            System.out.println(String.format("%.2f$ more needed.", neededMoney - budget));
        } else {
            System.out.println(String.format("Items purchased for %.2f$.", neededMoney));
        }


    }
}
