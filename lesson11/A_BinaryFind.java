package by.it.sc04_evening_tue_thu.yanushkevich.lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
В первой строке источника данных даны:
        - целое число 1<=n<=100000 (размер массива)
        - сам массив A[1...n] из n различных натуральных чисел,
          не превышающих 10E9, в порядке возрастания,
Во второй строке
        - целое число 1<=k<=10000 (сколько чисел нужно найти)
        - k натуральных чисел b1,...,bk не превышающих 10E9 (сами числа)
Для каждого i от 1 до kk необходимо вывести индекс 1<=j<=n,
для которого A[j]=bi, или -1, если такого j нет.

        Sample Input:
        5 1 5 8 12 13
        5 8 1 23 1 11

        Sample Output:
        3 1 -1 1 -1

(!)
Обратите внимание на смещение начала индекса массивов JAVA относительно условий задачи
Т.е. в Java массивы адресуются начиная с 0, а в задаче начиная с 1.
Обязательно учтите этот момент в решении, тест проверяет индексы как в задаче.
*/

public class A_BinaryFind {
    int[] findIndex(InputStream stream) throws FileNotFoundException {
        //подготовка к чтению данных
        Scanner scanner = new Scanner(stream);
        //!!!!!!!!!!!!!!!!!!!!!!!!!     НАЧАЛО ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        //размер отсортированного массива
        int n = scanner.nextInt();
        //сам отсортированный массива
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            a[i - 1] = scanner.nextInt(); //M2 исходный упорядоченный масив для поиска индексов
        }

        //размер массива индексов
        int k = scanner.nextInt();
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int value = scanner.nextInt(); //M3 в value поочередно заносим числа для поиска
            //тут реализуйте бинарный поиск индекса
            //для значения value в массиве a
            //результат поиска сохраните в result[i]

            //M4  Бинарный поиск LK11 p11


            int left = 0;
            int right = a.length - 1;

            while (left <= right) {

                int m = (left + right) / 2;

                if (a[m] == value) {
                    result[i] = m + 1;
                    break;
                }
                else if (a[m] > value)
                    right = m - 1;
                else
                    left = m + 1;

                result[i] = -1; //возвращаем -1 если числа  не найдено

            }
        }


      /*      int index= Arrays.binarySearch(a,value);
            if(index<0){
                result[i]=-1;
            }
            else result[i]=index+1;
        }*/



        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        return result;
    }


    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/akhmelev/lesson11/dataA.txt");

        A_BinaryFind instance = new A_BinaryFind();     //M1 создаем объект класса чтобы вызвать метода
        //long startTime = System.currentTimeMillis();
        int[] result = instance.findIndex(stream);
        //long finishTime = System.currentTimeMillis();
        for (int index : result) {
            System.out.print(index + " ");
        }
    }

}
