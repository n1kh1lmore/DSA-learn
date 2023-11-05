package reverse_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class library_reverse {
    static void printArray(Integer arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
        }
     }
     static void reverseArray(Integer arr[]){

        Collections.reverse(Arrays.asList(arr));
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }
        reverseArray(arr);
                printArray(arr, n);

        

sc.close();
    }
}
