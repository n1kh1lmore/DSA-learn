package unique_unsorted;

import java.util.Scanner;

public class unique_unsorted_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter array index " + i);
            arr[i] = sc.nextInt();
        }

         removeduplicate(arr, n);
        

        sc.close();
    }

    public static void removeduplicate(int[] arr, int n){
int[] mark = new int[n];
for(int i =0; i<n; i++){
    mark[i]= 1;
}

for(int i = 0; i<n;i++){
    if(mark[i] == 1){
        for(int j = i +1; j<n;j++){
if(arr[i] == arr[j]){
    mark[j] = 0;
}
        }
    }
}
for(int i = 0; i<n; i++){
    if(mark[i] == 1){
        System.out.print(arr[i] + " ");
    }
}
    }
}
