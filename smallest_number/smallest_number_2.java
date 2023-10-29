
/**
 * first
 */
import java.util.*;

public class smallest_number_2 {

    public static void main(String[] args) {
        // int arr1[] = {2,5,1,3,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }
        // int arr[] = { 4, 5, 2, 7, 1 };
        System.out.println("the smallest element in array is : " + sort(arr));
        sc.close();
    }

    static int sort(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
        if(arr[i] < min){
    min = arr[i];
 }           
        }
        return min;
    }
}