package Lessons;

import java.util.Scanner;

public class NumberType {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");

        for (int i = 1; i <= 1; i++){
            long num = scanner.nextInt();
            if (num % 2 == 0){
                System.out.println("Even number: " + num);
            } else {
                System.out.println("Odd number: " + num);
            }
        }
    }
}

