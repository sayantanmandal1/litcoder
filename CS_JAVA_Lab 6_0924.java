import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int result = findLargestSpecialPrime(inputNumber);
        System.out.println(result);
    }

    private static int findLargestSpecialPrime(int limit) {
        for (int num = limit - 1; num >= 2; num--) {
            if (isPrime(num) && isSpecialPrime(num)) {
                return num;
            }
        }
        return -1;
    }

    private static boolean isSpecialPrime(int num) {
        List<Integer> digits = new ArrayList<>();
        int temp = num;

        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        
        return checkCombinations(digits, "", 0);
    }

    private static boolean checkCombinations(List<Integer> digits, String current, int index) {
        if (index == digits.size()) {
            return false;
        }

        for (int i = index; i < digits.size(); i++) {
            String newNum = current + digits.get(i);
            int num = Integer.parseInt(newNum);
            if (!newNum.equals("0") && isPrime(num)) {
                if (i + 1 < digits.size()) {
                    if (checkCombinations(digits, newNum, i + 1)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
