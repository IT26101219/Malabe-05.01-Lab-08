import java.util.Scanner;

public class IT26101219Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];

        int i = 0;
        while (i < studentsArray.length) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for (int j = 0; j < studentsArray.length; j++) {
            if (studentsArray[j] == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

        sc.close();
    }
}