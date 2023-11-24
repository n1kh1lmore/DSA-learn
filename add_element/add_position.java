package add_element;

import java.util.Scanner;

public class add_position {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.println("enter array index " + i);
            arr[i] = sc.nextInt();
        }


        System.out.println("array");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nenter element value");
        int value  = sc.nextInt();
        System.out.println("\nenter position");
        int pos  = sc.nextInt();


         insert(arr, n, value, pos);

         System.out.println("After inserting the value at beginning:");
         for(int i=0;i<=n;i++)
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println();

        sc.close();
    }

    public static void insert(int[] arr, int n, int value, int pos){
for(int i =n ; i>= pos; i--){
    arr[i] = arr[i-1];
}
arr[pos-1] = value;
    }
}
