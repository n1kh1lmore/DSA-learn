import java.util.Arrays;
import java.util.Scanner;

public class second_smallest_largest_2 {
    static private void getElement(int[] arr, int n){
        if ( n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        System.out.println(second_small);
        System.out.println(small);
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        System.out.println(second_large);
        System.out.println(large);
        int i;
        for(i = 0; i < n; i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

for(i = 0; i < n ; i++){
    if(arr[i] < second_small && arr[i] != small){
        second_small = arr[i];
    }
    if(arr[i] > second_large && arr[i] != large){
        second_large = arr[i];
    }
}

        System.out.println("Second smallest is : " + second_small);
        System.out.println("Second largest is : " + second_large);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }

        getElement(arr, n);

        sc.close();
    }
}
