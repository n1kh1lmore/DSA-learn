package sum_array;

import java.util.Scanner;

public class sum_array_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
count = count + arr[i];
        }

        System.out.println(count);



        sc.close();
    }
}
