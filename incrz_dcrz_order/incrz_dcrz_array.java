package incrz_dcrz_order;

import java.util.Arrays;
import java.util.Scanner;

public class incrz_dcrz_array {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int first = (n/2) ;
        int second = (n/2);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }
Arrays.sort(arr);
for(int i = 0; i < first; i++){

    System.out.print(arr[i] + " ");
}
for(int i = n-1; i >= second; i-- ){
    System.out.print(arr[i] + " ");
}        

sc.close();
    }
}
