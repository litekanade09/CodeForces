import java.util.*;
public class A_Goals_of_Victory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n-1];
            int sum = 0;
            for(int i = 0; i < arr.length;i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println(-sum);
        }
        sc.close();
    }
}