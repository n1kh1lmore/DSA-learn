import java.util.Scanner;

public class second_smallest_largest_3 {
    

    static private int secondSmallest(int[] arr, int n){
        if(n<2){
            return -1;
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for(i = 0; i < n; i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }else if(arr[i]< second_small && arr[i] != small){
                second_small = arr[i];
            }
        }
        return second_small;
    }

    static private int secondLargest(int[] arr, int n){
        if(n<2)
            return -1;
            int large = Integer.MIN_VALUE;
            int second_large = Integer.MIN_VALUE;
int i;
for(i = 0; i < n; i++){
    if(arr[i]>large){
        second_large = large;
        large = arr[i];

    }
    else if(arr[i] > second_large && arr[i] != large){
        second_large = arr[i];
    }
}
return second_large;
        
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

        System.out.println("Second smallest is " +secondSmallest(arr, n));
        System.out.println("Second smallest is " +secondLargest(arr, n));
    }
}
