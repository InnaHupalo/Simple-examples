package Lessons;

import java.util.Scanner;

//Определить количество дней в году, который вводит пользователь. В високосном - 366 дней, в обычном 365

public class Year {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 != 0){
            System.out.println("It is a usual year with 365 days");

        } else if (year % 100 == 0 && year % 400 == 0){
            System.out.println("It is a leap year with 366 days");
        }
        else {
            System.out.println("It is a leap year with 366 days");
        }
    }
}
