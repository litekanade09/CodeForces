import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the testcase: ");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("n= ");
            int n = sc.nextInt();
            System.out.print("k= ");
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ;i < n; i++){
                arr[i] = sc.nextInt();
            }
            boolean sorted = true;
            for(int i = 0 ; i < n - 1;i++){
                if(arr[i] > arr[i+1]){
                    sorted = false;
                    break;
                }
            }
            if(k == 1){
                if(sorted){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("YES");
            }
        }
    }
}
