package by.it.sc04_evening_tue_thu.yanushkevich.lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA2 {

    public static void main(String[] args) throws IOException {

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        //запись в одну строку
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arc = new ArrayList<>(); //создание контейнера элементов по аналогии с созданием массива

        //ввод строк с клавиатуры (while потому как кол-во итераций неизветстно)
        while (true)
           {
               String line = reader.readLine(); //почему-то эта запись просит или IOException или try catch
               if(line.equals("END"))break;
               arc.add(line);
           }
            //можно было бы записать ещё короче
           // while (!(line = reader.readLine()).equals("END")) {arc.add(line);}

        System.out.println(arc); //Список - это объект. Его можно просто напечатать, как переменную.
        }

    }
