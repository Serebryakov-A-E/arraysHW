import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();

        //task 1
        System.out.printf("Сумма трат за месяц составила %,d рублей\n", findSum(randomArray));

        //task2
        int[] minMax = findMinAndMax(randomArray);
        System.out.printf("Минимальная сумма трат за день составила %,d рублей. Максимальная сумма трат за день составила %,d рублей\n", minMax[0], minMax[1]);

        //task3
        System.out.printf("Средняя сумма трат за месяц составила %,.2f рублей\n", findAverage(randomArray));
        
        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        
        
        
    }

    static int findSum(int[] array) {
        //System.out.printf("Сумма трат за месяц составила %,d рублей\n", Arrays.stream(array).sum());

        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        return sum;
    }

    static int[] findMinAndMax(int[] array) {
        int[] resultArr = new int[2];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        resultArr[0] = min;
        resultArr[1] = max;

        return resultArr;
    }

    static double findAverage(int[] array) {
        //System.out.printf("Средняя сумма трат за месяц составила %,.2f рублей", Arrays.stream(generateRandomArray()).average().getAsDouble());

        return (double) findSum(array) / array.length;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
