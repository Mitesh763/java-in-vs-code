package clg_Program_5Sem_ADA;

public class Practical_9_LCS {
    public static String findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a table to store the lengths of LCS for subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Build the dp[][] in a bottom-up manner
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Reconstruct the LCS from dp[][]
        int lcsLength = dp[m][n];
        char[] lcs = new char[lcsLength];
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs[lcsLength - 1] = s1.charAt(i - 1);
                i--;
                j--;
                lcsLength--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return new String(lcs);
    }

    public static void main(String[] args) {
        String s1 = "abbacdcba";
        String s2 = "bcdbbcaac";

        String lcs = findLCS(s1, s2);
        System.out.println("Longest Common Subsequence: " + lcs);
    }
}
