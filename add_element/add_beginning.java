package add_element;

import java.util.Scanner;

public class add_beginning {
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
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nenter element value");
        int value  = sc.nextInt();


         insert(arr, n, value);

         
        

        sc.close();
    }

    public static void insert(int[] arr, int n, int value){
        int[] arr2 = new int[n+1];
        for(int i=n-1;i>=0;i--)
        {
            arr2[i+1]=arr[i];
        }
        arr2[0]=value;
        System.out.println("array after inserting new element");

         for(int i = 0; i<n+1; i++){
            System.out.print(arr2[i] + " ");
         }
    }
}
