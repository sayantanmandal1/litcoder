import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstArray = scanner.nextLine().trim().split(" ");
        String[] secondArray = scanner.nextLine().trim().split(" ");
        String[] thirdArray = scanner.nextLine().trim().split(" ");
        
        HashSet<Integer> firstSet = new HashSet<>();
        for (String num : firstArray) {
            firstSet.add(Integer.parseInt(num));
        }

        HashSet<Integer> commonElements = new HashSet<>();
        for (String num : secondArray) {
            int value = Integer.parseInt(num);
            if (firstSet.contains(value)) {
                commonElements.add(value);
            }
        }

        HashSet<Integer> finalCommonElements = new HashSet<>();
        for (String num : thirdArray) {
            int value = Integer.parseInt(num);
            if (commonElements.contains(value)) {
                finalCommonElements.add(value);
            }
        }

        if (finalCommonElements.isEmpty()) {
            System.out.println("No Elements");
        } else {
            for (int element : finalCommonElements) {
                System.out.print(element + " ");
            }
        }
    }
}
