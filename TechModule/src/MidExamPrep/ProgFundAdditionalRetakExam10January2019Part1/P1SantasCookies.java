package MidExamPrep.ProgFundAdditionalRetakExam10January2019Part1;

import java.util.Scanner;

public class P1SantasCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalBoxes = 0;
        for (int i = 0; i < n; i++) {
            int flour = Integer.parseInt(scanner.nextLine());
            int sugar = Integer.parseInt(scanner.nextLine());
            int cocoa = Integer.parseInt(scanner.nextLine());
         int   boxesPerBake = SantaCookies(flour, sugar, cocoa );
            if (boxesPerBake > 0) {
                totalBoxes = totalBoxes + boxesPerBake;
                System.out.println(String.format("Boxes of cookies: %d", boxesPerBake));

            } else {
                System.out.println("Ingredients are not enough for a box of cookies.");
            }
        }
        System.out.println("Total boxes: "+totalBoxes);
    }

    public static int SantaCookies(int flour, int sugar, int cocoa) {
        int singleCookieGrams = 25;
        int cup = 140;
        int smallSpoon = 10;
        int bigSpoon = 20;
        int cookiesPerBox = 5;

        double flourCups = Math.floor((double) flour / cup);
        double sugarSpoons = Math.floor((double) sugar / bigSpoon);
        double cocoaSpoons = Math.floor((double) cocoa / smallSpoon);
        double cookiesPerBake = (cup + smallSpoon + bigSpoon)
                * Math.min(Math.min(flourCups, sugarSpoons), cocoaSpoons) / singleCookieGrams;
        int boxesPerBake = (int) (cookiesPerBake / cookiesPerBox);

return boxesPerBake;
    }
}
