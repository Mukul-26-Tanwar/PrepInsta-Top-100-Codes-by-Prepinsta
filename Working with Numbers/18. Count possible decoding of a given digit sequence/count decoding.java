import java.util.*;

class PossibleDecoding
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Helper h = new Helper();
        int ans=h.countDecodings(str);
        System.out.print(ans);

    }
}
class Helper
{
    int countDecodings(String digits) {
        int n = digits.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // Check if the current digit is a valid single-digit number
            if (digits.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }

            // Check if the current and previous digit form a valid double-digit number
            if (digits.charAt(i - 2) == '1' || (digits.charAt(i - 2) == '2' && digits.charAt(i - 1) <= '6')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}