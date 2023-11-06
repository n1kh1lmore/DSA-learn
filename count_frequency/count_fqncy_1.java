package count_frequency;

import java.util.Scanner;

public class count_fqncy_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }
        countfrq(arr, n);
        

sc.close();
    }

    public static void countfrq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(visited[i] == true){
                continue;
            }

            int count = 1;
                for(int j = i + 1; j < n; j++){
if(arr[i] == arr[j]){
    visited[j] = true;
count++;
}
                }
                System.out.println(arr[i] + " " + count);
        }
    }
}
