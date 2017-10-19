package by.it.sc04_evening_tue_thu.yanushkevich.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код

    public static void main(String[] args) {

        int mas[] = new int[20];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }

        sort(mas);

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }


    public static void sort(int[] array) {
        //Напишите тут ваш код

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) { // сортировка по убыванию
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
}

