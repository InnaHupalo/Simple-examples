package Lessons;

/*
Построить таблицу умножения и выведите в консоль посредством вложенных циклов
(вид должен быть как на школьной тетрадке). Используйте форматирование строк для красивого вывода.
 */

public class MultiplicationTable {
    public static void main (String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
