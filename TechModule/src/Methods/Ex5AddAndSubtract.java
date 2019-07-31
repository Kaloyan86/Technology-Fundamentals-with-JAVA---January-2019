package Methods;

import java.util.Scanner;

public class Ex5AddAndSubtract {
    public static int Add(int num1,int num2){
        int sum = num1+num2;
      return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int result = Add(num1,num2)-num3;
        System.out.println(result);
    }
}
