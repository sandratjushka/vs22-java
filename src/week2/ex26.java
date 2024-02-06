package week2;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number; // Add the read number to the sum

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
        scanner.close();
    }
}
