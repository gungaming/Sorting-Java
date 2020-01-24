package bigo;
import java.util.Arrays;
public class BigO {
// Java Program implementing 
// binary insertion sort 
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*((100000-1)+0)+0);
        }
        
        int[] arr2 = new int[100000];
        int[] arr3 = new int[100000];
        System.arraycopy(arr, 0, arr2, 0, 100000);
        System.arraycopy(arr, 0, arr3, 0, 100000);
        long being = System.currentTimeMillis();
        new BigO().sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("\n"+"Duration : "+(System.currentTimeMillis()-being)+" miliseconds");
        //----------------------------------------------------------------------------
        
        long being2 = System.currentTimeMillis();
        new BigO().linaersort(arr2);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
         System.out.println("\n"+"Duration : "+(System.currentTimeMillis()-being2)+" miliseconds");
//        ----------------------------------------------------------------
        long being3 = System.currentTimeMillis();
        Arrays.sort(arr3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("\n"+"Duration : "+(System.currentTimeMillis()-being3)+" miliseconds");
    }
    
//    ----------------------------------------------
    void linaersort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
    public void sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            // Find location to insert using binary search 
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
            // Shifting array to one location right 
            System.arraycopy(array, j, array, j + 1, i - j);
            // Placing element at its correct location 
            array[j] = x;
        }
    }
    // Code contributed by Mohit Gupta_OMG  
}
