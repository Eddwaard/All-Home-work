public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Тренеровка светофор 1");
        //Убираем матрёшку
        char color = 'g';
        char r;
        char y;
        char g;
        if (color == 'r') {
            System.out.println("Красный. Ехать нельзя!");
        } else if (color == 'y') {
            System.out.println("Желтый. Внимание!!");
        } else System.out.println("Зелённый. Ехать можно!!! ");
    }

    public static void task2() {
        System.out.println("Тренеровка светофор 2");
        //Добовляем Switch
        char color = 'g';
        char r;
        char y;
        char g;
        char l;
        switch (color) {
            case 'r':
                System.out.println("Красный! Ехать нельзя!");
                break;
            case 'y':
                System.out.println("Желтый! Внимание!!");
                break;
            case 'g':
                System.out.println("Зелёный! Можно ехать!!!");
                break;
            case 'l':
                System.out.println("Поворот налево!");
                break;
            default:
                System.out.println("Светофор сломался!");
        }
    }

    public static void task3() {
        System.out.println("Задание 1");
        int clientOs = 1;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке!");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке!");

        }
    }

    public static void task4() {
        System.out.println("Задание 2");
        int clientOs = 1;           //Операционная система IOS=0 / Android=1
        int clientDeviceYear = 2014;//Год выпуска телефона

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

    public static void task5() {
        System.out.println("Задание 3");
        int year = 2400;
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if (year4 == 0 && year100 != 0 || year400 == 0) {
            System.out.println(year + " высокосный год");
        } else {
            System.out.println(year + " год не высокосный");
        }
    }

    public static void task6() {
        System.out.println("Задание 4");
        int deliveryDistance = 0;  //Фактическая до клиента в Км
        int delivery20Km = 20;     //Доставка в пределах 20 Км занимает 1 сутки-deliveryIn1Day
        int deliveryIn1Day = 1;
        int delivery60Km = 60;     //Доставка в пределах 20-60 Км занимает 2 суток-deliveryIn2Day
        int deliveryIn2Day = 2;
        int delivery100Km = 100;   //Доставка в пределах 60-100 Км занимает 3 суток-deliveryIn3Day
        int deliveryIn3Day = 3;

        if (deliveryDistance <= delivery20Km) {
            System.out.println("Потребуется дней для доставки банковской карты:" + deliveryIn1Day);
        } else if (deliveryDistance > delivery20Km && deliveryDistance <= delivery60Km) {
            System.out.println("Потребуется дней для доставки банковской карты:" + deliveryIn2Day);
        } else if (deliveryDistance > delivery60Km && deliveryDistance <= delivery100Km) {
            System.out.println("Потребуется дней для доставки банковской карты:" + deliveryIn3Day);
        } else {
            System.out.println("Расстояние свыше 100 Км, доставки нет!");
        }
    }

    public static void task7() {
        System.out.println("Задание 5");
        int monthNumber = 122;

        switch (monthNumber) {
            case 12:
            case 1 :
            case 2 :
                System.out.println("Зимa");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Лето");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не корректно введены данные, месяцец 12, в значение " + monthNumber + "!");
        }
    }
}
