package sum_array;

import java.util.Scanner;
import java.util.stream.IntStream;

public class sum_array_collection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }

        int sum = 0;
sum += IntStream.of(arr).sum();

        System.out.println(sum);



        sc.close();
    }
}
