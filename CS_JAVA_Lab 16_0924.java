import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int target = inp.nextInt();
        int n = inp.nextInt();
        PriorityQueue<Integer> candies = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            candies.add(inp.nextInt());
        }

        int steps = 0;

        while (candies.size() > 1 && candies.peek() < target) {
            int leastSweet = candies.poll();
            int secondLeastSweet = candies.poll();
            int newCandy = leastSweet + 2 * secondLeastSweet;
            candies.add(newCandy);
            steps++;
        }

        if (candies.peek() >= target) {
            System.out.println(steps);
        } else {
            System.out.println(-1);
        }

        inp.close();
    }
}
