package find_unique;

import java.util.HashSet;
import java.util.Scanner;

public class unique_element_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }

int k = removeduplicate(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

sc.close();
    }

public static int removeduplicate(int arr[]){
    HashSet < Integer> set = new HashSet < > ();
    for(int i = 0; i < arr.length; i++){
        set.add(arr[i]);
    }

    int k = set.size();
    int j = 0;
     for(int x: set){
    arr[j++] = x;
     }
     return k;
}
    
}
