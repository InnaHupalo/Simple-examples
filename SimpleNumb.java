package Lessons;

import java.util.Scanner;
/*
 Написать метод вычисляющий все простые числа от 1 до числа введенного пользователем.
 Дополнительно вывести сумму всех найденных простых чисел.
*/

public class SimpleNumb {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your simple number: ");
        int n = sc.nextInt();

        boolean simple = true;

        for (int i = 2; i <= n; i++) {               // start from 2 because it's the 1st simple number
            for (int i2 = 2; i2 < i; i2++) {
                if (i % i2 == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) System.out.println(i);
            else simple = true;
        }
    }
}
