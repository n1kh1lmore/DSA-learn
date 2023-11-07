package count_frequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count_fqncy_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("enter array index " + i);
        arr[i] = sc.nextInt();
        }
        
        countfrequency(arr, n);

sc.close();
    }

    static void countfrequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
