import java.util.*;

public class A_How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(n, k, arr) ? "YES" : "NO");
        }
        sc.close();
    }

    private static boolean solve(int n, int k, int[] arr) {
        int countK = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                countK++;
            }
        }

       
        if (countK == 0) return false;

       
        if (n == 1) return arr[0] == k;

        for (int i = 0; i < n; i++) {
            if (arr[i] != k) continue;

            for (int j = i + 1; j < Math.min(i + 3, n); j++) {
                if (arr[j] == k) {
                    return true;
                }
            }
        }

        return countK >= 1;
    }
}
