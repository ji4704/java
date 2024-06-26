package Java0325;

import java.util.Arrays;

public class BubbleSortExample {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < (n-i-1); j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
          //  System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[] ={6,3, 9, 11, 14, 22, 43, 58 };

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}