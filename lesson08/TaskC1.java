package by.it.sc04_evening_tue_thu.yanushkevich.lesson08;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner водятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("Введите кличку возраст вес и силу первой собаки" );
        Scanner sc = new Scanner(System.in);
        dog1.setName(sc.next());
        dog1.setAge(sc.nextInt());
        dog1.setWeight(sc.nextInt());
        dog1.setPower(sc.nextDouble());
        System.out.println("Введите кличку возраст вес и силу второй собаки" );
        dog2.setName(sc.next());
        dog2.setAge(sc.nextInt());
        dog2.setWeight(sc.nextInt());
        dog2.setPower(sc.nextDouble());


       /*
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName("Рокфор");
        dog2.setName("Бетмен");
        dog1.setAge(10);
        dog2.setAge(8);
        dog1.setWeight(15);
        dog2.setWeight(10);
        dog1.setPower(10);
        dog2.setPower(15);
        */


        System.out.println("Победителем становиться: ");

        if (dog1.win(dog2)) {
            System.out.println(dog1.getName());
        } else {
            System.out.println(dog2.getName());
        }
    }


}
