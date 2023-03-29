public class Main {

    public static void main(String[] args) {
//        task1();
        task2();//Задание 1
        task3();//Задание 2
        task4();//Задание 3
        task5();//Задание 4

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
        int i = 0;
        for (i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        double[] weights2 = new double[]{1, 2, 3};
        weights2[0] = 1.57;
        weights2[1] = 7.654;
        weights2[2] = 9.986;
        int b = 0;
        for (i = 0; i < weights.length; i++) {
            System.out.println(weights2[i]);
        }
        int[] weightsCucumbers = new int[]{1, 2, 3};
        weightsCucumbers[0] = 15;
        weightsCucumbers[1] = 6;
        weightsCucumbers[2] = 22;
        int c = 0;
        for (i = 0; i < weights.length; i++) {
            System.out.println(weightsCucumbers[i]);
        }
    }

    public static void task3() {
        System.out.println("Задание 2");

        // Вывести целочисленные в строку 1, 2, 3
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        int i = 0;
        for (i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }

        // Вывести дробные в строку 1.57, 7.654, 9.986
        double[] weights2 = new double[]{1, 2, 3};
        weights2[0] = 1.57;
        weights2[1] = 7.654;
        weights2[2] = 9.986;
        for (i = 0; i < weights2.length; i++) {
            if (i == weights2.length - 1) {
                System.out.println(weights2[i]);
                break;
            }
            System.out.print(weights2[i] + ", ");
        }

        // Вывести вес огурцов в строку 15, 6, 22
        int[] weightsCucumbers = new int[]{1, 2, 3};
        weightsCucumbers[0] = 15;
        weightsCucumbers[1] = 6;
        weightsCucumbers[2] = 22;
        for (i = 0; i < weightsCucumbers.length; i++) {
            if (i == weightsCucumbers.length - 1) {
                System.out.println(weightsCucumbers[i]);
                break;
            }
            System.out.print(weightsCucumbers[i] + ", ");
        }
    }
    public static void task4() {
        System.out.println("Задание 3");

        // Вывести целочисленные в обратном порядке 1, 2, 3
        int[] weights = new int[3];
        weights[2] = 1;
        weights[1] = 2;
        weights[0] = 3;
        int i = 0;
        for (; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }

        // Вывести дробные в обратном порядке 1.57, 7.654, 9.986
        double[] weights2 = new double[]{1, 2, 3};
        weights2[2] = 1.57;
        weights2[1] = 7.654;
        weights2[0] = 9.986;
        i =0;
        for (; i < weights2.length; i++) {
            if (i == weights2.length - 1) {
                System.out.println(weights2[i]);
                break;
            }
            System.out.print(weights2[i] + ", ");
        }

        // Вывести вес огурцов в обратном порядке 15, 6, 22
        int[] weightsCucumbers = new int[]{1, 2, 3};
        weightsCucumbers[2] = 15;
        weightsCucumbers[1] = 6;
        weightsCucumbers[0] = 22;
        for (i=0; i < weightsCucumbers.length; i++) {
            if (i == weightsCucumbers.length - 1) {
                System.out.println(weightsCucumbers[i]);
                break;
            }
            System.out.print(weightsCucumbers[i] + ", ");
        }
    }
    public static void task5() {
        System.out.println("Задание 4");

        // Преобразовать целочисленные 1, 2, 3 в четные числа +1
        int[] weightsStone = new int[6];
        weightsStone[0] = 1;
        weightsStone[1] = 2;
        weightsStone[2] = 3;
        weightsStone[3] = 4;
        weightsStone[4] = 5;
        weightsStone[5] = 6;
        int i;
        for (i=0; i < weightsStone.length; i++) {
            if (i == weightsStone.length - 1) {
                System.out.println(weightsStone[i]);
                break;
            }
            if (i % 2 != 0)
            System.out.print(weightsStone[i] + ", ");
        }
    }
}