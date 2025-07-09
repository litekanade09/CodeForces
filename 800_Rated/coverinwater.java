import java.util.Scanner;

public class coverinwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean flag = true;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    count++;
                }
                if (i > 0 && i < n - 1) {
                    if (s.charAt(i - 1) == '.' && s.charAt(i) == '.' && s.charAt(i + 1) == '.') {
                        System.out.println(2);
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println(count);
            }
        }
    }
}
