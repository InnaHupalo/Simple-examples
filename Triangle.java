package Lessons;

import java.util.Scanner;

// Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.

public class Triangle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        int a = scanner.nextInt();

        System.out.print("Enter the length of side B: ");
        int b = scanner.nextInt();

        System.out.print("Enter the length of side C: ");
        int c = scanner.nextInt();

        if ((a + b) > c && (a + c) > b && (b + c) > a){
            System.out.print("Triangle exists");
        } else {
            System.out.print("Triangle doesn't exist");
        }
    }
}
