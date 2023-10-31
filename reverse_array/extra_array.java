package reverse_array;

import java.util.Scanner;

public class extra_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--){
arr2[i] = arr[i]; 
System.out.print("Reverse array is " + arr2[i]);
        }

sc.close();
    }
}
