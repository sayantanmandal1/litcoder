import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine().trim();
        String end = scanner.nextLine().trim();
        
        System.out.println(canTransform(start, end));
    }

    private static boolean canTransform(String start, String end) {
        if (start.length() != end.length()) {
            return false;
        }

        int countXStart = 0, countXEnd = 0;
        for (int i = 0; i < start.length(); i++) {
            char s = start.charAt(i);
            char e = end.charAt(i);
            
            if (s == 'X') countXStart++;
            if (e == 'X') countXEnd++;
            
            if ((s == 'L' && e == 'R') || (s == 'R' && e == 'L')) {
                return false;
            }
        }

        return countXStart >= countXEnd;
    }
}
