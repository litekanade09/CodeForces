import java.util.*;
public class A_Ambitious_Kid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean zero = false;
        int minops = Integer.MAX_VALUE;
        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                zero = true;
            }
            minops = Math.min(minops,Math.abs(arr[i]));
        }
        if(zero){
            System.out.println(0);
        }else{
            System.out.println(minops);
        }
    }
}