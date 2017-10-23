package by.it.sc04_evening_tue_thu.yanushkevich.lesson08;

public class Dog {

    private String name;
    private int age;
    private int weight;  //вес собаки
    private double power; //сила укуса собаки


    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
      /*  if (age<0) throw new Exception("эй ты чувак - возраст отриц ввел");*/
        this.age = age;
    }

    public int getWeight() { // Alt-Insert Generate - Getters Setters
        return weight;
    }

    public double getPower() {
        return power;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        // String result=String.format("Шарик. Возраст: 5", name, age);
        return "Кличка: " + name + ". Возраст: " + age;

    }

    boolean win(Dog otherDog) {
        // Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

        double thisDogChance = age * 0.2 + weight * 0.3 + power * 0.5;
        double otherDogChance = otherDog.age * 0.2 + otherDog.weight * 0.3 + otherDog.power * 0.5;

        if (thisDogChance > otherDogChance) {
            return true;
        } else {
            return false;
        }

    }


}
