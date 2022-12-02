public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] weight = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] weights = {102, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weights[i]);
        }
            boolean arraysAreEqual = true;
            arraysAreEqual = weight.length == weights.length;
            if (arraysAreEqual) {
                for (int i = 0; i < weight.length; i++) {
                    if (weight[i] != weights[i]) {
                        arraysAreEqual = false;
                    }
                }
            }
        if (arraysAreEqual){
            System.out.println("массивы одинаковые");
        }else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (final int current : weight) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);


        for (int i = 0; i < weight.length - 1 && weight[i + 1] != 0; i++) {
            System.out.println(weight[i + 1] - weight[i]);
        }
        }
    }