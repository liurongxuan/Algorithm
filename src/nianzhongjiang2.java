import java.util.Scanner;

public class nianzhongjiang2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt(); //总钱数
            int m = scanner.nextInt(); //个数
            int[] v = new int[m]; //价格
            int[] p = new int[m]; //价格*重要度
            int[] q = new int[m]; //0表示为主件，>0表示附件所属的主件编号
            for (int i = 0; i < m; i++) {
                v[i] = scanner.nextInt();
                p[i] = scanner.nextInt() * v[i];
                q[i] = scanner.nextInt();
            }
            System.out.println(getMaxValue(n, m, v, p, q));
        }
    }

    public static int getMaxValue(int n, int m, int[] v, int[] p, int[] q) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (q[i - 1] == 0)  //主件
                {
                    if (v[i - 1] <= j)
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - v[i - 1]] + p[i - 1]);
                } else  //附件
                {
                    if (v[i - 1] + v[q[i - 1]] <= j)
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - v[i - 1] - v[q[i - 1]]] + p[i - 1] + p[q[i - 1]]);
                }
            }
        }
        return dp[m][n];
    }
}