package array_median;

import java.util.Arrays;
import java.util.Scanner;

public class array_median {

public static void getmedian(int arr[], int n){
    Arrays.sort(arr);

    if(n%2 == 0){
        int index1 = (n/2) - 1;
        int index2 = (n/2);
        System.out.println((double)arr[index1]+arr[index2]/2);
    }else{
        System.out.println(arr[n/2]);
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
        getmedian(arr, n);


sc.close();
    }
}
