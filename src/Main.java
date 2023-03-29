import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        task1();
        task2();//Задание 1
        task3();//Задание 2
        task4();//Задание 3
        task5();//Задание 4 способ 1
        task6();//Задание 4 способ 2
    }

    /*public static void task1() {
        System.out.println("Тренировочное задание");
        int[] weights = new int[]{90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        // Объявляем массив
        weights[0] = 90;
        // Присваиваем значение 1-му элементу
        int januaryWeight = weights[0];
        // Записываем значение 1-го элемента массива в переменную
        System.out.println(januaryWeight);
        // Выводим в консоль 1-й элемент массива. Способ 1
        System.out.println(weights[0]);
        // Выводим в консоль -й элемент массива. Способ 2
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
    }
**/
    public static void task2() {
        System.out.println("Задание 1");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        double[] weights2 = {1.57, 7.654, 9.986};
        int[] weightsCucumbers = {15, 6, 22};
    }

    public static void task3() {
        System.out.println("Задание 2");
        // Вывести числа массивов в строку через запятую
        int[] weights = {1, 2, 3};
        double[] weights2 = {1.57, 7.654, 9.986};
        int[] weightsCucumbers = {15, 6, 22};
        // Вывод 1 массива
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Вывод 2 массива
        for (int i = 0; i < weights2.length; i++) {
            System.out.print(weights2[i]);
            if (i != weights2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Вывод 3 массива
        for (int i = 0; i < weightsCucumbers.length; i++) {
            System.out.print(weightsCucumbers[i]);
            if (i != weightsCucumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 3");
        // Вывести числа массивов в строку через запятую в обратном порядке
        int[] weights = {1, 2, 3};
        double[] weights2 = {1.57, 7.654, 9.986};
        int[] weightsCucumbers = {15, 6, 22};
        // Вывод 1 массива
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Вывод 2 массива
        for (int i = weights2.length - 1; i >= 0; i--) {
            System.out.print(weights2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Вывод 3 массива
        for (int i = weightsCucumbers.length - 1; i >= 0; i--) {
            System.out.print(weightsCucumbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задание 4 способ 1");

        // Преобразовать целочисленные 1, 2, 3 в четные числа
        int[] weightsStone = new int[6];
        weightsStone[0] = 1;
        weightsStone[1] = 2;
        weightsStone[2] = 3;
        weightsStone[3] = 4;
        weightsStone[4] = 5;
        weightsStone[5] = 6;
        int i;
        for (i = 0; i < weightsStone.length; i++) {
            if (i == weightsStone.length - 1) {
                System.out.println(weightsStone[i]);
                break;
            }
            if (i % 2 != 0)
                System.out.print(weightsStone[i] + ", ");
        }
    }

    public static void task6() {
        System.out.println("Задание 4 способ 2");
        // Преобразовать целочисленные 1, 2, 3 в четные числа +1
        int [] weights = {1, 2, 3};
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i] = weights[i]+1;
            }
        }
        System.out.println(Arrays.toString(weights));
    }
}