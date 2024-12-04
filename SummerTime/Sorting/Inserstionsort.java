package Sorting;

public class Inserstionsort {
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

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};  // n = 5

        inserstionSort(arr);
        printArr(arr);

    }

}
