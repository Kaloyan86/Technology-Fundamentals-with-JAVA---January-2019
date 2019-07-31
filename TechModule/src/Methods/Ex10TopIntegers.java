package Methods;

import java.util.Scanner;

public class Ex10TopIntegers {
    public static void topNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            boolean isOdd = false;
            while (num > 0) {
                if ((num%10)%2!=0){
                    isOdd = true;
                }
                sum = sum + num % 10;
                num = num / 10;

            }
            if (sum%8==0&&isOdd){
                System.out.println(i);
            }
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        topNumbers(n);
    }
}
