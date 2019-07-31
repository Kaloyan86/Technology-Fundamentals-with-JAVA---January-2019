package Arrays2019;

import java.util.Scanner;

public class Ex9KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String mainInput = scanner.nextLine();

        int maxLength = 0;
        int currentLength = 0;
        int position = 1000000000;
        int currentPosition = 0;
        int maxSum = 0;
        int currentSum = 0;
        int count = 0;
        int bestCount = 0;
        String bestLocalDna = "";
        char[] result = new char[n];
        while (!mainInput.equals("Clone them!")) {
            count++;
            String command = mainInput.replaceAll("!+", "");
            String[] input = command.split("0");

            for (int i = 0; i < input.length; i++) {
                currentSum += input[i].length();
                if (input[i].length() > currentLength) {
                    currentLength = input[i].length();
                    bestLocalDna = input[i];

                }
            }
            currentPosition = command.indexOf(bestLocalDna);

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxSum = currentSum;
                position = currentPosition;
                bestCount=count;
                result = command.toCharArray();
            } else if (currentLength == maxLength && (position > currentPosition || currentSum > maxSum)) {

                maxLength = currentLength;
                maxSum = currentSum;
                position = currentPosition;
                bestCount=count;
                result = command.toCharArray();

            } else if (count == 1) {
                maxLength = currentLength;
                maxSum = currentSum;
                position = currentPosition;
                bestCount=count;
                result = command.toCharArray();
            }


            currentLength = 0;
            currentPosition = 0;
            currentSum = 0;

            mainInput = scanner.nextLine();

        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestCount, maxSum);
        for (char res :
                result) {
            System.out.print(res + " ");

        }
    }
}
