package average_array;

import java.util.Scanner;

public class loop_average {

public static void average(int arr[], int n){
    int sum = 0;

    for(int i = 0; i < n; i++){
    sum += arr[i];
    }
    int avg = sum / n;
System.out.println(avg);
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
        
        average(arr, n);
        
        

sc.close();
    }
}
