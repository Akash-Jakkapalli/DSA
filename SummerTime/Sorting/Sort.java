
// all in one

package Sorting;
import java.util.*;
public class Sort {

    // Bubble Sortting  

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){  // outer loop
            for(int j=1; j<arr.length-1-turn; j++){  // inner loop
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //------------------------------------------------------------------------------------------------------------------>
    // Selection Sorting

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    //------------------------------------------------------------------------------------------------------------------>
    // Inserstion sorting

    public static void inserstionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int perv = i-1;
            // finding out the currect pos to inert
            while (perv >=0 && arr[perv] > curr) {
                arr[perv+1] = arr[perv];
                perv--;   
            }
            // insertion
            arr[perv+1] = curr;

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};  // n = 5

        inserstionSort(arr);
        printArr(arr);

        selectionSort(arr);
        printArr(arr);

        bubbleSort(arr);
        printArr(arr);
    }
}
