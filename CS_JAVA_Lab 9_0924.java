import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] charlieInput = scanner.nextLine().trim().split(" ");
        String[] daveInput = scanner.nextLine().trim().split(" ");
        
        int[] charlieScores = new int[charlieInput.length];
        int[] daveScores = new int[daveInput.length];
        
        for (int i = 0; i < charlieInput.length; i++) {
            charlieScores[i] = Integer.parseInt(charlieInput[i]);
        }
        
        for (int i = 0; i < daveInput.length; i++) {
            daveScores[i] = Integer.parseInt(daveInput[i]);
        }

        int[] result = compareScores(charlieScores, daveScores);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] compareScores(int[] charlieScores, int[] daveScores) {
        int charliePoints = 0;
        int davePoints = 0;

        for (int i = 0; i < charlieScores.length; i++) {
            if (charlieScores[i] > daveScores[i]) {
                charliePoints++;
            } else if (charlieScores[i] < daveScores[i]) {
                davePoints++;
            }
        }

        return new int[]{charliePoints, davePoints};
    }
}
