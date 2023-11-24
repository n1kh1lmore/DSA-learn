package add_element;

// import java.util.Scanner;

public class add_end {
    public static void main(String[] args) {
       
        int n=8;
        int arr[]={10,9,14,8,20,48,16,9,1};
        int value=40;
        System.out.println("Before inserting the value at beginning:");
        System.out.println(arr.length);
         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

         insert(arr, n, value);

         System.out.println("\nAfter inserting the value at beginning:");
         for(int i=0;i<=n;i++)
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
        

        // sc.close();
    }

    public static void insert(int[] arr, int n, int value){
        arr[n] = value;
    }
}
