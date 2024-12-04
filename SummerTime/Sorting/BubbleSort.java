package Sorting;

public class BubbleSort {
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
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};  // n = 5

        bubbleSort(arr);
        printArr(arr);
    }
}
