package Lessons;

import java.util.Scanner;

//Вывести все квадраты натуральных чисел, не превосходящие данного числа N. Пример: N=50 | 1 4 9 16 25 36 49

// неверно считает

public class Square {

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive number: ");
            int n = sc.nextInt();
            int i = 1;

            while (Math.sqrt(i) <= n) {
                System.out.println(Math.sqrt(i));
                i++;
            }
        }
}

