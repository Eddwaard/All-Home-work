import java.util.Arrays;

public class Main {
    public static void printSeparator() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }




    public static void main(String[] args) {
        task0();//Тренеровочная задача от наставника
        task1();//Задача 1
        task2();//Задача 2
        task3();//Задача 3
    }

    static void task0() {
        System.out.println("Тренеровочная задача от наставника");
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + "Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());//геттер
        System.out.println("sarah.age = " + sarah.getAge());  //геттер
        sarah.setAge(31);                                     //сеттер
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.getName());//геттер
        System.out.println("john.age = " + john.getAge());  //геттер
        john.setAge(14);                                    //сеттер
        System.out.println("john.getAge() = " + john.getAge());
    }

    static void task1() {
        System.out.println("Задача 1");

    }

    static void task2() {
        System.out.println("Задача 2");

    }

    static void task3() {
        System.out.println("Задача 3");

    }

}







