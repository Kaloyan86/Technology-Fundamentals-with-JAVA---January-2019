package Methods.MethodsMoreExcercise;

import java.util.Scanner;

public class Ex1DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstCommand = scanner.nextLine();
        String secondCommand = scanner.nextLine();

        dataTypes(firstCommand, secondCommand);


    }

    private static void dataTypes(String firstCommand, String secondCommand) {
        if (firstCommand.equals("int")) {
            int num = Integer.parseInt(secondCommand);
            int result = num * 2;
            System.out.println(result);
        } else if (firstCommand.equals("real")) {
            double num = Double.parseDouble(secondCommand);
            double result = num * 1.5;
            System.out.println(String.format("%.2f",result));
        }else if (firstCommand.equals("string")){
            System.out.println("$"+secondCommand+"$");
        }
    }
}
