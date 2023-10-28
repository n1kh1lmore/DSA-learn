import java.util.Arrays;
import java.util.Scanner;

public class second_smallest_largest {
    static private void getElement(int[] arr, int n){
        if ( n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println("Second smallest is : " + small);
        System.out.println("Second largest is : " + large);
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
    }
}
