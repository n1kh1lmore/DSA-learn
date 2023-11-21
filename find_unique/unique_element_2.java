package find_unique;

import java.util.Scanner;

public class unique_element_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter array index " + i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int k = removeduplicate(arr);
        System.out.println("The array after removing duplicate elements is " + k );
    
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static int removeduplicate(int[] arr) {
        System.out.println("function called");
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i);
        return i + 1;

    }
}
