import java.util.*;
public class A_Jagged_Swaps{

    static boolean isSorted(int arr[]){
        for(int i = 1 ; i < arr.length;i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ;i< n;i++){
                arr[i] = sc.nextInt();
            }
            boolean sorted = false;
            do{
                sorted = false;
                for(int i = 1; i < n-1;i++){
                    if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        sorted = true;
                    }
                }
            }while(sorted);
            if(isSorted(arr)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}