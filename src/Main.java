public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4(); //Задание 1
        task5(); //Задание 2
        task6(); //Задание 3
        task7(); //Задание 4 и 5
        task8(); //Задание 6
        task9(); //Задание 7
        task10(); //Задание 8
    }

    /* public static void task1() {
         System.out.println("Принцып работы цикла while");
         //Цикл выполняется, только в том случае если выполняется условие, если start = 0, то цикл не выполнится и не выведет результат в консоль
         int start = 5;
         while (start > 0) {
             System.out.println(start);
             start = start - 1;
         }
     }

     public static void task2() {
         System.out.print("Принцып работы цикла do while");
         //Цыкл выполнится в любом условии хотя бы 1 раз, потому что работает по принцыпу сначала действие, а потом проверка условия
         //Весь момент завязан на переменной если start = 0, то консоль выведет 0. Т.е. цикл в любом случае выполнится
         int start = 5;
         do {
             System.out.println(start);
             start = start - 1;
         }
         while (start > 0);
     }

     public static void task3() {
         System.out.println("Тренировачное задание по замене For на While");
         int salary = 65535;
         int total = 0;
         int i = 0;
         while (total < 1_000_000) {
             total = total + total / 100;
             total = total + salary;
 //            System.out.println("Месяц " + i + " Итого " + total) ;
             System.out.println(total);
         }
 //        System.out.println(total);
 //        System.out.println(i);
     }
 **/
    public static void task4() {
        System.out.println("Задача 1");
        //Накопить 2 459 000 откладывая каждый месяц 15000р
        int accrual = 15000;
        int totalAccrual = 0;
        int totalMonth = 0;
        while (totalAccrual <= 2_459_000) {
            totalAccrual = totalAccrual + accrual;
            totalMonth = totalMonth + 1;
            System.out.println("Месяц " + totalMonth + ", сумма накоплений равна " + totalAccrual + " рублей");
        }
        System.out.println("Что бы накопить " + totalAccrual + " рублей, нужно " + totalMonth + " месяца");
    }

    public static void task5() {
        System.out.println("Задача 2");
        int start = 10;
        int i = 10;
        while (start > 0) {
            System.out.print(start + " ");
            start = start - 1;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task6() {
        System.out.println("Задача 3");
        //Нужно посчитать сколько человек родилось и умерло за 10 лет
        int countryY = 12_000_000;//Население в стране Y
        int totalCountryY = 12_000_000;//Население в стране Y + ежегодный прирост
        int birth = 17;//Рождаемость на каждую 1000 человек
        int mortality = 8;//Смертность на каждую 1000 человек
        int totalBirth = birth - mortality;//Количество родившихся с учетом, что 8 умерло
        int totalBirthInOneYear = totalCountryY / 1000 * totalBirth;//Всего человек родилось за 1 год
        int year = 1;

        for (year = 1; year <= 10; year++) {
            totalBirthInOneYear = totalCountryY / 1000 * totalBirth;
            totalCountryY = totalCountryY + totalBirthInOneYear;
            System.out.println("Год " + year + ", численность населения состовляет " + totalCountryY);
        }
    }

    public static void task7() {
        System.out.println("Задача 4 и 5");
        float salary = 15_000;
        float percent = 0.07F;
        int month = 1;

        for (; salary <= 12_000_000; month++) {
            //month = month + 1;
            salary = salary + (salary * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", средств накоплено " + salary);
            }
        }
        System.out.println("Всего понадобиться " + month + " месяцев, для накопления " + salary + " рублей");
    }

    public static void task8() {
        System.out.println("Задача 6");
        /*Василий решил, что будет копить деньги ближайшие 9 лет.
        Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет**/
        float salary = 15_000;
        float percent = 0.07F;
        int nineYears = 9 * 12;
        int month = 1;

        for (; month <= nineYears; month++) {
            salary = salary + (salary * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", средств накоплено " + salary);
            }
        }
        System.out.println("За " + nineYears + " месяцев, Василий накопит " + salary + " рублей");
    }

    public static void task9() {
        System.out.println("Задача 7");
        int friday = 3; // число первой пятницы в новом месяце
        int month = 31; // число дней в отчетном месяце
        for (; friday <= month; friday = friday + 7) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task10() {
        System.out.println("Задача 8");
        int flyingComet = 79; //Каждые 79 лет пролетаен новая комета
        int year = 1896;
        int year1 = 200; //Последние 200 лет пролетает комета
        int year2 = 100; //Следующий ближайший год появления кометы
        for (flyingComet = 1896; flyingComet <= year + year1 + year2; flyingComet = flyingComet + 79) {
            System.out.println(flyingComet);
        }

    }
}
