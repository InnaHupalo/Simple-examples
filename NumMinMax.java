package Lessons;

import java.util.Scanner;

/*
Определить какое из трех, введенных пользователем, чисел максимальное и вывести его на экран
Определить какое из трех, введенных пользователем, чисел минимальное и вывести его на экран
Пользователь вводит от 2 чисел и больше (проверочка) - вывести минимальное на экран.- вывести максимальное на экран.
- вывести сумму всех чисел на экран.- вывести среднее значение чисел на экран.
 */

public class NumMinMax {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i = 3;
        float sum = a + b + c;
        float average = sum / i;

        if (a > b) {
            System.out.println("Max number = " + Math.max(a, c));
        } else {
            System.out.println("Max number = " + + Math.max(b, c));
        }

        if (a < b ){
            System.out.println("Min number = " + Math.min(a, c));
        } else {
            System.out.println("Min number = " + Math.min(b, c));
        }

         System.out.println("Sum = " + sum);
         System.out.println("Average value = " + average);
    }
}
