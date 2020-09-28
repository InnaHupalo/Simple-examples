package Lessons;

import java.util.Scanner;

/*
Дано число. Найти сумму и произведение его цифр.
 */

public class NaturalNum1 {
    public static int even;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int sumNumbers = 0;
        int sumMultiplications = 1;

        while (n > 0) {
            int digit = n % 10;                  // почему вычисляем остаток от деления на 10? числа же разной длины
            n /= 10;                             // убирается последняя цифра числа - почему п считаем как деленое на 10?
            sumNumbers += digit;
            sumMultiplications *= digit;
        }
        // need to correct this part of code with IF operator, it doesn't show sum of even digits
            if (n % 2 == 0){
                n /= 10;
                System.out.println("Sum of even digits in number: " + even++);
            } else {
                System.out.println("This number has only odd digits");
            }

        System.out.println("The Sum of digits = " + sumNumbers);
        System.out.println("The Multiplication amount of digits = " + sumMultiplications);
        }
    }
