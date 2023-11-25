package find_repeated;

import java.util.Scanner;

public class find_repeated_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter array index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        repeated(arr);

        sc.close();
    }

    public static void repeated(int[] arr) {
        // System.out.println(arr.length);
        int[] mark = new int[arr.length];
        int[] found = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mark[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    mark[i] = 0;
                }
            }
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (mark[i] == 0) {
                System.out.println("added" + i);
                found[count++] = arr[i];
            }

        }

        for (int i = 0; i < count; i++) {
            System.out.print(found[i]);
        }
    }
}
