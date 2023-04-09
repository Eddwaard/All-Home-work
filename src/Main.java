import java.util.Arrays;

public class Main {
    public static void printSeparator() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("-------------------------------------------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static void printYear() {
        int year = 2400;
        System.out.println(year);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        return sum;
    }

    public static void checkYearIsLeap(int year) {
        //Метод к 1 задаче
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if (year4 == 0 && year100 != 0 || year400 == 0) {
            System.out.println(year + " высокосный год");
        } else {
            System.out.println(year + " год не высокосный");
        }
    }

    public static void getOsRecommendation(int clientOs, int clientDeviceYear) {
        //Метод к 2 задаче
        // int clientOs = 1;           Операционная система IOS=0 / Android=1
        //int clientDeviceYear = 2014; Год выпуска телефона

        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке!");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке!");

        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке!");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке!");
        }
    }

    public static void daysForDelivery(int deliveryDistance) {
        //Метод 1 для 3 задачи
        int days = deliveryDays(deliveryDistance);
        String deliveryInfo = days == -1 ? "Расстояние больше 100 Км доставки нет" : String.format("Потребуется дней для доставки банковской карты: %s", days);
        System.out.println(deliveryInfo);
    }

    public static int deliveryDays(int deliveryDistance) {
        //Метод 2 для 3 задачи
        //int deliveryDistance = 0;      //Фактическая до клиента в Км
        int delivery20Km = 20;     //Доставка в пределах 20 Км занимает 1 сутки-deliveryIn1Day
        int deliveryIn1Day = 1;
        int delivery60Km = 60;     //Доставка в пределах 20-60 Км занимает 2 суток-deliveryIn2Day
        int deliveryIn2Day = 2;
        int delivery100Km = 100;   //Доставка в пределах 60-100 Км занимает 3 суток-deliveryIn3Day
        int deliveryIn3Day = 3;

        if (deliveryDistance <= delivery20Km) {
            return 1;
        } else if (deliveryDistance > delivery20Km && deliveryDistance <= delivery60Km) {
            return 2;
        } else if (deliveryDistance > delivery60Km && deliveryDistance <= delivery100Km) {
            return 3;
        }
        return -1;
    }



    public static void main(String[] args) {
        task0();//Тренеровочная задача от наставника
        task1();//Задача 1
        task2();//Задача 2
        task3();//Задача 3
    }

    static void task0() {
        System.out.println("Тренеровочная задача от наставника");
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);
    }

    static void task1() {
        System.out.println("Задача 1");

        checkYearIsLeap(2400);
        checkYearIsLeap(2401);
        checkYearIsLeap(2402);
        checkYearIsLeap(2403);
        checkYearIsLeap(2404);
    }

    static void task2() {
        System.out.println("Задача 2");

        getOsRecommendation(1, 2011);//Первый пользователь
        getOsRecommendation(1, 2023);//Второй пользователь
        getOsRecommendation(0, 2014);//Третий пользователь
        getOsRecommendation(0, 2022);//Четвертый пользователь
    }

    static void task3() {
        System.out.println("Задача 3");
        daysForDelivery(19);
        daysForDelivery(30);
        daysForDelivery(90);
        daysForDelivery(1010000000);
        }
    }






