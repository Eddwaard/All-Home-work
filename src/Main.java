public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var allWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println("общий вес боксёров " + allWeight + "кг!");
        var differentInWeightBetweenTwoBoxers = oneBoxerWeight - twoBoxerWeight;
        System.out.println("разница в весе между двумя боксёрами " + differentInWeightBetweenTwoBoxers + "кг!");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var athletesWeightDifference1 = twoBoxerWeight - oneBoxerWeight;
        System.out.println("разница весов спортсменов, методом вычитания из большего меньшее " + athletesWeightDifference1 + "кг!");
        var athletesWeightDifference2 = (twoBoxerWeight % oneBoxerWeight);
        System.out.println("разница весов спортсменов, методом остаток деления на " + athletesWeightDifference2 + "кг!");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var allTimesForWork = 640;
        var timeForOneEmployee = 8;
        var allEmployee1 = allTimesForWork/timeForOneEmployee;
        System.out.println("Всего сотрудников в компании " + allEmployee1 + " человек");
        var additionalStaff = 94.0;
        var allEmployee2 = allEmployee1 + additionalStaff;
        var allTimes = allTimesForWork/allEmployee2;
        System.out.println("Если в компании работает " + allEmployee2 + " человек, то всего по " + allTimes + " часов работы может быть поделенно между сотрудниками.");

    }
}