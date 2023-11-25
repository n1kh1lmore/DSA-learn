package unique_unsorted;

import java.util.HashMap;
import java.util.Scanner;

public class unique_unsorted_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter array index " + i);
            arr[i] = sc.nextInt();
        }

        removeduplicate(arr, n);

        sc.close();
    }

    public static void removeduplicate(int[] arr, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                mp.put(arr[i], i);
            }
        }
    }
}
