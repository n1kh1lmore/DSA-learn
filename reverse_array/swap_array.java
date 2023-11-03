package reverse_array;

import java.util.Scanner;

public class swap_array {
    static void reverseArray(int arr[], int n){
        int p1 = 0, p2 = n-1;

        while(p1<p2){
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;

        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]);
        }
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
        reverseArray(arr, n);
        

sc.close();
    }
}
