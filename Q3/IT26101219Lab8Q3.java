import java.util.Scanner;

public class IT26101219Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        int i = 0;
        while (i < numbers.length) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int value = sc.nextInt();

            if (value <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[i] = value;
                i++;
            }
        }

        int max = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        System.out.println("\nArray Contents:");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        sc.close();
    }
}