package Lessons;

// Написать метод вычисляющий и возвращающий факториал числа. тест: 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040

// не вычисляет как нужно !!!

import java.util.Scanner;
import java.math.BigInteger;

public class Factor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.print(Factorial(num).toString());
    }

    public static BigInteger Factorial (int num) {

        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
