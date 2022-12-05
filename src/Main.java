public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        //Задача 1
        System.out.println("Задача 1");
        int[] array = generateRandomArray(30);
        int total = 0;
        for (int i : array) {
            total = total + i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("траты " + (i + 1) + " день "  + array[i] + " ");
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        //Задача 2
        System.out.println("Задача 2");
        int maxExpenses = -1;
        int minExpenses = 200_000;
        for (final int current : array) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
            if (current < minExpenses) {
                minExpenses = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей");
        //Задача 3
        System.out.println("Задача 3");
        System.out.println("Средняя сумма трат за месяц составила " + total/ array.length + " рублей");
        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
        public static int[] generateRandomArray(int length) {
        java.util.Random random = new java.util.Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }
}