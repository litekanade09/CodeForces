import java.util.*;
public class A_Doremy_s_Paint_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
           HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }

            if (freq.size() == 1) {
                System.out.println("Yes");
            } else if (freq.size() == 2) {
                List<Integer> counts = new ArrayList<>(freq.values());
                if (Math.abs(counts.get(0) - counts.get(1)) <= 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}