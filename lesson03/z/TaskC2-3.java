package by.it.sc04_evening_tue_thu.rumiantsau.lesson03;

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

import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int sm = d1 + d2;

        String b1  = Integer.toBinaryString(d1);
        String b2  = Integer.toBinaryString(d2);
        String bSm = Integer.toBinaryString(sm);

        System.out.printf("DEC:%d+%d=%d%n", d1, d2, sm);
        System.out.printf("BIN:%s+%s=%s%n", b1, b2, bSm);
        System.out.printf("HEX:%x+%x=%x%n", d1, d2, sm);
        System.out.printf("OKT:%o+%o=%o%n", d1, d2, sm);
    }
}