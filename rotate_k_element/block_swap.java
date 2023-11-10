package rotate_k_element;

import java.util.Scanner;

public class block_swap {
        
    public static void swap(int[] arr, int a, int b, int k) {
        for (int i = 0; i < k; i++) {
          int temp = arr[a + i];
          arr[a + i] = arr[b + i];
          arr[b + i] = temp;
        }
      }


    public static void blockswap(int[] arr, int i, int k, int n){
if(k==0 || k==n)
return;


if(k == n-k){
    swap(arr, i, n-k+i, k);
    return;
}

else if(k < n-k){
    swap(arr, i, n-k+i, k);
    blockswap(arr, i, k, n-k);
}else{
    swap(arr, i, k, n-k);
    blockswap(arr, n-k+i, 2*k-n, k);
}

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

       System.out.println("please enter value of K");
       int k = sc.nextInt();

       blockswap(arr, 0, k, n);

       System.out.println("After rotating array ");

       for(int i = 0; i < n; i++){
        System.out.print(arr[i]);
       }



        sc.close();
    }
}
