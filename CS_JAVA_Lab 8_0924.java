import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().trim().split(" ");
        int[] sightings = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            sightings[i] = Integer.parseInt(inputArray[i]);
        }

        int result = findMostCommonPlant(sightings);
        System.out.println(result);
    }

    private static int findMostCommonPlant(int[] sightings) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int id : sightings) {
            frequencyMap.put(id, frequencyMap.getOrDefault(id, 0) + 1);
        }

        int maxCount = 0;
        int mostCommonPlant = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int id = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount || (count == maxCount && id < mostCommonPlant)) {
                maxCount = count;
                mostCommonPlant = id;
            }
        }

        return mostCommonPlant;
    }
}
