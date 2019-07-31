package Methods;

        import java.util.Arrays;
        import java.util.Scanner;

public class Ex1SmallestOfThreeNumbers {
    public static void smallestNumber(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        smallestNumber(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
    }
}
