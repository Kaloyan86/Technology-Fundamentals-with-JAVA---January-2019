package MidExam10March2019;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int groupPeople = Integer.parseInt(scanner.nextLine());
        double fuelPerKm = Double.parseDouble(scanner.nextLine());
        double foodExpenses = Double.parseDouble(scanner.nextLine());
        double roomPrice = Double.parseDouble(scanner.nextLine());

        double priceHotelAllNights = roomPrice * groupPeople * days;
        if (groupPeople > 10) {
            priceHotelAllNights *= 0.75;
        }
        double foodExpAll = foodExpenses * groupPeople * days;
        double currentExpenses = priceHotelAllNights + foodExpAll;
        for (int i = 1; i <= days; i++) {
            if (budget < currentExpenses) {
                break;
            }
            double distance = Double.parseDouble(scanner.nextLine());
            currentExpenses += (distance * fuelPerKm);


            if (i % 3 == 0) {
                if (budget < currentExpenses) {
                    break;
                }
                currentExpenses = currentExpenses + (currentExpenses * 0.4);

            }
            if (i % 5 == 0) {
                if (budget < currentExpenses) {
                    break;
                }
                currentExpenses = currentExpenses + (currentExpenses * 0.4);

            }
            if (i % 7 == 0) {
                if (budget < currentExpenses) {
                    break;
                }
                currentExpenses -= (currentExpenses / groupPeople);
            }

        }
        if (budget >= currentExpenses) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - currentExpenses);
        } else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", currentExpenses - budget);
        }

    }
}
