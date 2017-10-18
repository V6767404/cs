package by.it.sc04_evening_tue_thu.sushchenja.lesson03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    public static void main(String[] args) throws Exception
    {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int dec = a + b;
            System.out.println("DEC:" + a + "+" + b + "=" + dec);
            System.out.println("BIN:" + Integer.toString(a, 0b10) + "+"  + Integer.toString(b, 0b10)+ "=" + Integer.toString(dec, 0b10));
            System.out.println("HEX:" + Integer.toString(a, 0x10) + "+"  + Integer.toString(b, 0x10)+ "=" + Integer.toString(dec, 0x10));
            System.out.println("OKT:" + Integer.toString(a, 010) + "+"  + Integer.toString(b, 010)+ "=" + Integer.toString(dec, 010));
    }

}




