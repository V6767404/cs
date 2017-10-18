package by.it.sc04_evening_tue_thu.bayramova.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Ввод:
34 26

Вывод:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OKT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("DEC" + ":" + a + "+" + b + "=" + sum );
        System.out.println("BIN" + ":" + Integer.toString(a, 2) + "+" + Integer.toString(b, 2) + "=" + Integer.toString(sum, 2) );
        System.out.println("HEX" + ":" + Integer.toString(a, 16) + "+" + Integer.toString(b, 16) + "=" + Integer.toString(sum, 16) );
        System.out.println("OKT" + ":" + Integer.toString(a, 8) + "+" + Integer.toString(b, 8) + "=" + Integer.toString(sum, 8) );


    }


}
