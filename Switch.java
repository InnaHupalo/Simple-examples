package Lessons;

/*
Возрастная категория. Пользователь вводит число от 1 до 100. Разбить 100 летний отрезок по 10 лет образно обозначив их
 (пример: 0-10 - юнец, 30-40 - старЫк, 70-80 - столько не живут...)
 */

import java.util.Scanner;

public class Switch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            switch (number/10){
                case 0:
                    System.out.print("child");                      // 0 - 9   !? how start count from 1 ???
                    break;

                case 1:
                    System.out.print("junior");                     // 10 - 19
                    break;

                case 2:
                    System.out.print("teenager");                  // 20 - 29
                    break;

                case 3:
                    System.out.print("young");                      // 30 - 39
                    break;

                case 4:
                    System.out.print("adult");                       // 40 - 49
                    break;

                case 5:
                    System.out.print("not old yet");                 // 50 - 59
                    break;

                case 6:
                    System.out.print("you are ready to be a granny"); // 60 - 69
                    break;

                case 7:
                    System.out.print("ready to be a granny");         // 70 - 79
                    break;

                case 8:
                    System.out.print("time to leave for yourself");   // 80 - 89
                    break;

                case 9:
                    System.out.print("OMG!");                          // 90 - 99
                    break;

                case 100:
                    System.out.print("Unbelievable age!");              // 100
                    break;

                default:
                    System.out.print("This age doesn't exist");

            }
        }
    }
