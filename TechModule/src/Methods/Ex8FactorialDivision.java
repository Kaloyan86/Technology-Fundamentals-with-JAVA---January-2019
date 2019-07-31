package Methods;

import java.util.Scanner;

public class Ex8FactorialDivision {
    public static long factorial(long num) {
        long fact = 1;
        for (long i = 1; i <= num; i++) {
            fact = fact * i;

        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = Integer.parseInt(scanner.nextLine());
        long num2 = Integer.parseInt(scanner.nextLine());
        long fact1 = factorial(num1);
        long fact2 = factorial(num2);
        double result = factorial(num1)*1.0 / factorial(num2);
        System.out.printf("%.2f", result);


    }
}
