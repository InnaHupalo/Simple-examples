package Lessons;

import java.util.Scanner;

// Написать программу, подсчитывающую количество четных и нечетных цифр в числе

public class OddEven {
    public static int even;
    public static int odd;

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        while (num > 0){

            if (num % 2 == 0) {
                num /= 10;        // why need this operation?
                even++;
            } else {
                num /= 10;        // why need this operation?
                odd++;
            }
        }
        System.out.println("Even digits number: " + even +", " + "Odd digits number: " + odd);

    }
}
