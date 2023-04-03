import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    static void task1() {
        System.out.println("Тренеровочная задача от наставника");
        int[] weight = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        // Объявляем переменную с максимальным весом
        // Значение переменной меньше любого элемента в массиве
        int maxWeight = -1;
        for (final int current : weight) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println("Максимальный вес " + maxWeight + "Кг");
        // Сравниваем maxWeight с каждым элементом массива
        for (int i = 0; i < weight.length - 1 && weight[i + 1] != 0; i++) {
            System.out.println(weight[i + 1] - weight[i]);
        }
    }

    static void task2() {
        System.out.println("Задача 1");
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц
        int[] arr = generateRandomArray();
        // Тут пишем задачу №1
        int sumForMonth = 0;
        for (int i : arr) {
            sumForMonth = sumForMonth + i;
        }
        System.out.println("Сумма трат за месяц составила " + sumForMonth + " рублей");
    }

    static void task3() {
        System.out.println("Задача 2");
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день
        int[] arr = generateRandomArray();
        // Тут пишем задачу №2
        int minArray = arr[0];
        int maxArray = arr[0];
        for (int i : arr) {
            if (i < minArray) minArray = i;
            if (i > maxArray) maxArray = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + minArray + " рублей." + " Максимальнаясумма трат за день составила " + maxArray + " рублей!");
    }

    static void task4() {
        System.out.println("Задача 3");
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней
        int[] arr = generateRandomArray();
        // Тут пишем задачу №3
        double sum = 0.0;
        for (double i : arr) {
            sum = sum + i / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
    }

    static void task5() {
        System.out.println("Задача 4");
        //В этом задании нужно написать код который будет корректно выводить значение в консоль Ivanov Ivan
        // Тут пишем задачу №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i != 0);
            System.out.print(reverseFullName[i]);
        }
    }
}



