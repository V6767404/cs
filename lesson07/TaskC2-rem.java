package by.it.sc04_evening_tue_thu.yanushkevich.lesson07;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskC1 {

    public static void main(String[] args) throws Exception {

        //System.out.println("Введите с клавиатуры 20 чисел");


        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 20 ; i++) { list.add(sc.nextInt()); }


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            //Integer input = reader.read();
            Integer input = Integer.parseInt(reader.readLine());
            list0.add(input);
        }
        //System.out.println(list0);

        for (Integer x : list0) {
            if (x % 2 == 0 || x % 3 == 0 ) {

                if (x % 2 == 0) list1.add(x);
                if (x % 3 == 0) list2.add(x);

            }else {
                list3.add(x);
            }
        }
        //System.out.println(list1);
        //System.out.println(list2);
        //System.out.println(list3);


        ArrayList <ArrayList> arrayOfLists = new ArrayList<>();
        arrayOfLists.add(list2);
        arrayOfLists.add(list1);
        arrayOfLists.add(list3);
        //Collections.addAll(arrayOfLists, list1, list2, list3);
        printList(arrayOfLists);


    }


    private static void printList(List<ArrayList> list) {
        for (ArrayList aList : list) System.out.println(aList);

        //переделал метод - именил тип данных
        //исходный код с типом Integer - не могу в него список списков передать
        //и не понятно что за тип List принимаемой переменной в методе???

        //private static void printList(List<Integer> list) {
        //  for (Integer aList : list) System.out.println(aList);


    }
}
