import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int queriesCount = scanner.nextInt();
        long[] array = new long[size + 1];

        for (int i = 0; i < queriesCount; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            long value = scanner.nextInt();
            array[start] += value;
            if (end + 1 <= size) {
                array[end + 1] -= value;
            }
        }

        long maxValue = 0;
        long currentValue = 0;

        for (int i = 1; i <= size; i++) {
            currentValue += array[i];
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }

        System.out.println(maxValue);
    }
}
