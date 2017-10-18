package by.it.sc04_evening_tue_thu.krasikova.lesson03;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)
Требования:
1. Метод getWeight(int) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/

import java.util.Scanner;


class TaskC3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Ввод:");
        System.out.println(i);
        System.out.println("");
        System.out.println("Вывод:");
        System.out.println(getWeight(i));

    }

    public static double getWeight(double x) {
        double weightMars = 3.86 / 9.81 * x * 100;
        int weight = (int) weightMars;
        double newWeightMars = (double) weight / 100;
        return newWeightMars;

    }
}



