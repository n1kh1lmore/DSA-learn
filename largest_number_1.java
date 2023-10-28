import java.util.*;

public class largest_number_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }
System.out.println("Largest number in this array is " + sort(arr, size));
sc.close();
    }

    static int sort(int arr[], int size){
Arrays.sort(arr);
// return arr[size-1]; my approach
return arr[arr.length-1];
    }
}
