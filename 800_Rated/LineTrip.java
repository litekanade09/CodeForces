import java.util.*;
public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i < n;i++){
                arr[i] = sc.nextInt();
            }
            int ans = Integer.MIN_VALUE;
            int last = 0;
            for(int i = 0 ; i < n;i++){
                ans = Math.max(ans,arr[i] - last);
                last = arr[i];
            }
            int gas = x - last;
            ans = Math.max(ans,2*gas);
            System.out.println(ans);
        }
    }
}
