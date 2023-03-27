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

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 2645366;
        System.out.println("Значение переменной int с типом целочисленное равно " + a);
        byte b = 127;
        System.out.println("Значение переменной byte с типом целочисленное равно " + b );
        short c = 32500;
        System.out.println("Значение переменной short с типом целочисленное равно " + c);
        long d = 512354876;
        System.out.println("Значение переменной long с типом целочисленное равно " + d);
        float e = 6.5F;
        System.out.println("Значение переменной float с типом целочисленное равно " + e);
        double f = 54.1;
        System.out.println("Значение переменной double с типом целочисленное равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.768F;
        System.out.println(c);
        int d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        long f = 27897;
        System.out.println(f);
        byte g = 69;
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        int paperSheet = 480;
        System.out.println("На каждого ученика рассчитано " + (paperSheet) / (ludmilaStudents + annaStudents + ekaterinaStudents) + " листов бумаги!");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte productionOfBottlesIn1Minute = 8;//бутылок в минуту

        byte oneTimeProduction = 20;//минут
        System.out.println("За " + oneTimeProduction + " минут машина произвела " + oneTimeProduction*productionOfBottlesIn1Minute + " штук бутылок");
        byte touTimeProduction = 1;//сутки
        System.out.println("За " + touTimeProduction + " сутки машина произвела " + touTimeProduction*24*60*8 + " штук бутылок");
        byte threeTimeProduction = 3;//сутки
        System.out.println("За " + threeTimeProduction + " суток машина произвела " + threeTimeProduction*24*60*8 + " штук бутылок");
        byte fourTimeProduction = 1;//месяц
        System.out.println("За " + fourTimeProduction + " суток машина произвела " + fourTimeProduction*31*24*60*8 + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte allCansOfPaint = 120;
        byte cansOfWhitePaint = 2;
        byte cansOfBrownPaint = 4;
        byte allCansForOneClasses = (byte) (cansOfWhitePaint+cansOfBrownPaint);
        byte allClasses = (byte) (allCansOfPaint/allCansForOneClasses);
        byte allCansOfWhitePaint = (byte) (allClasses*cansOfWhitePaint);
        byte allCansOfBrownPaint = (byte) (allClasses*cansOfBrownPaint);
        System.out.println("В школе, где " + allClasses + " классов, нужно " + allCansOfWhitePaint + " банок белой краски и " + allCansOfBrownPaint + " банок коричневой краски!" );
    }
    public static void task6 () {
        System.out.println("Задача 6");
        //Все переменные записанны в граммах
        byte weightOneBananas = 80;
        byte weightMilk = 105;
        byte weightAceCream = 100;
        byte weightOneEgg = 70;
        short weightFiveBananas= (short) (weightOneBananas*5);
        short allWeightMilk = (short) (weightMilk*2);
        short allWeightAceCream = (short) (weightAceCream*2);
        short allWeightEggs = (short) (weightOneEgg*4);
        float allWeightInGram = (weightFiveBananas + allWeightMilk + allWeightAceCream + allWeightEggs);
        float allWeightInKg = (allWeightInGram/1000);
        System.out.println("Вес одного завтрака для спортсмена состовляет " + allWeightInGram + " грамм");
        System.out.println("Вес одного завтрака для спортсмена состовляет " + allWeightInKg + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short loseWeight = 7000;//Кг
        short loseWeightInADayMin = 250;//Грамм
        short loseWeightInADayMax = 500;//Грамм
        int allDayLoseWeightMin = loseWeight/loseWeightInADayMin;
        System.out.println("Если спортсмен худеет в день на " + loseWeightInADayMin + " грамм, то ему понадобиться " + allDayLoseWeightMin + " дней");
        int allDayLoseWeightMax = loseWeight/loseWeightInADayMax;
        System.out.println("Если спортсмен худеет в день на " + loseWeightInADayMax + " грамм, то ему понадобиться " + allDayLoseWeightMax + " дней");
        int averageNumbersOfDaysToLoseWeight = (allDayLoseWeightMin + allDayLoseWeightMax)/2;
        System.out.println("Среднее количество времени для похудения на 7 кг, составляет " + averageNumbersOfDaysToLoseWeight + " день!");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis =83690;
        int salaryKristina =76230;
        float indexing = 0.10F;
        float salaryMashaAfterIndexing = (salaryMasha*indexing) + salaryMasha;
        System.out.println("Месячная зарплата Маши после ежегодного повышения составляет "+salaryMashaAfterIndexing + " т.р");
        float salaryDenisAfterIndexing = (salaryDenis*indexing) + salaryDenis;
        System.out.println("Месячная зарплата Дениса после ежегодного повышения составляет "+salaryDenisAfterIndexing + " т.р");
        float salaryKristinaAfterIndexing = (salaryKristina*indexing) + salaryKristina;
        System.out.println("Месячная зарплата Дениса после ежегодного повышения составляет "+salaryKristinaAfterIndexing + " т.р");

        //Годовая зарплата Маши до и после повышения на 10%
        float salaryMashaForTheYear = salaryMasha*12;
        float salaryMashaForTheYearAfterIndexing = salaryMashaAfterIndexing*12;
        System.out.println("За год  работы до повышения зарплаты Маша получает " + salaryMashaForTheYear + " т.р");
        System.out.println("За год  работы после повышения зарплаты Маша теперь получает " + salaryMashaForTheYearAfterIndexing + " т.р." + " Годовой доход вырос на " + (salaryMashaForTheYearAfterIndexing % salaryMashaForTheYear) + " т.р");
        //Годовая зарплата Дениса до и после повышения на 10%
        float salaryDenisForTheYear = salaryDenis*12;
        float salaryDenisForTheYearAfterIndexing = salaryDenisAfterIndexing*12;
        System.out.println("За год  работы до повышения зарплаты Денис получает " + salaryDenisForTheYear + " т.р");
        System.out.println("За год  работы после повышения зарплаты Денис теперь получает " + salaryDenisForTheYearAfterIndexing + " т.р." + " Годовой доход вырос на " + (salaryDenisForTheYearAfterIndexing % salaryDenisForTheYear) + " т.р");
        //Годовая зарплата Кристины до и после повышения на 10%
        float salaryKristinaForTheYear = salaryKristina*12;
        float salaryKristinaForTheYearAfterIndexing = salaryKristinaAfterIndexing*12;
        System.out.println("За год  работы до повышения зарплаты Кристина получает " + salaryKristinaForTheYear + " т.р");
        System.out.println("За год  работы после повышения зарплаты Кристина теперь получает " + salaryKristinaForTheYearAfterIndexing + " т.р." + " Годовой доход вырос на " + (salaryKristinaForTheYearAfterIndexing % salaryKristinaForTheYear) + " т.р");
    }
}

