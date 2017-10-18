package by.it.sc04_evening_tue_thu.yanushkevich.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/

class TaskC1 {

    public static void main(String[] args) {
        System.out.println("Введите два числа (посчитаем сумму)");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
