package Arrays2019;

import java.util.Scanner;

public class Ex1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] wagon = new int[n];
        int sum = 0;
        for (int i = 0; i <wagon.length ; i++) {
            wagon[i]=Integer.parseInt(scanner.nextLine());
            sum+=wagon[i];
            System.out.print(wagon[i]+" ");
        }
        System.out.println("\n"+sum);
    }
}
