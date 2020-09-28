package Lessons;

import java.util.Scanner;

// Определить, кратно ли заданное число трем; если нет, вывести остаток

public class Remainder {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number ");
        int number = sc.nextInt();

        if (number % 3 == 0) {
            System.out.println("Your number is a multiple of three");
        } else {
            System.out.println("Remainder is " + (double) number % 3);
        }

    }
}
