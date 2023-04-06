import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();//Тренеровочная задача от наставника
        task2();//Задача 1
        task3();//Задача 2
        task4();//Задача 3
    }

    static void task1() {
        System.out.println("Тренеровочная задача от наставника");
        String phone = "+960-415 75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }

    static void task2() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    static void task3() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        String small = fullName + "vanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + small.toUpperCase());
    }
    static void task4() {
        System.out.println("Задача 3");
        String firstName = "Семён";
        String middleName = "Иванов";
        String lastName = "Семёнович";
        String fullName = middleName + " " + firstName + " " + lastName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}






