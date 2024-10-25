import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        StringBuilder pin = new StringBuilder();

        for (String number : numbers) {
            int sum = 0;
            for (char digit : number.toCharArray()) {
                sum += Character.getNumericValue(digit);
            }
            while (sum >= 10) {
                sum = sumDigits(sum);
            }
            char encodedChar = (sum % 2 == 0) ? (char) ('0' + sum) : (char) ('a' + (sum - 1));
            pin.append(encodedChar);
        }

        System.out.println(pin.toString());
    }

    private static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
