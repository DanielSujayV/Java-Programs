import java.io.*;
import java.util.*;

public class Solution {

    public static boolean canAttendMeetings(int[][] intervals) {
        // TODO: Implement the function
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int[][] intervals = new int[N][2];

        for (int i = 0; i < N; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        if (canAttendMeetings(intervals)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
