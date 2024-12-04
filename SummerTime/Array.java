
import java.util.Scanner;
import java.util.*;

// Input, Output, Update 

public class Array {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);  // input
        
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy : " + marks[0]);  // Output
        System.out.println("che : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // marks[1] = marks[1] + 1;  // Update
        // System.out.println("che : "+ marks[1]); 

        int perentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("perentage : " + perentage + "%");

        System.out.println(marks.length);  // lenth of the array -> 100
    }
}

// ------------------------------------------------------------------------------------------------------------------>
// lenear search

// public class Array{
//     public static int linearSearch(int numbers[], int key){
            
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;

//         int index = linearSearch(numbers, key);
//         if(index == -1){
//             System.out.println("NOT Found");
//         }else{
//             System.out.println("key is an index : " + index);
//         }

//     }
// }

// // ------------------------------------------------------------------------------------------------------------------>
// // largest num in array

// public class Array {
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;    // -infinity
//         int smallest = Integer.MAX_VALUE;    // +infinity

//         for(int i=0; i<numbers.length; i++){
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest>numbers[i]){
//                 smallest = numbers[i];
//             }       
//         }
//         System.out.println("smallest num is " + smallest);      
//         return largest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1,2,6,3,5};
//         System.out.println("largest num is " + getLargest(numbers));     
        
//     }
// }



// // ------------------------------------------------------------------------------------------------------------------>
// // Binary Search


// public class Array {
//     public static int binarySearch(int number[],int key){
//         int start = 0, end = number.length-1;

//         while(start<=end){
//             int mid = (start + end) / 2;

//             //comparisons
//             if(number[mid] == key){
//                 return mid;
//             }
//             if(number[mid]<key){
//                 start = mid + 1;
//             }
//             if(number[mid]>key){
//                 start = mid -1;
//             }
//         }
//         return -1;
//     }
    
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;
//         System.out.println("index is : " + binarySearch(numbers, key));
//     }
// }


// // ------------------------------------------------------------------------------------------------------------------>
// // reverse an array
 
// public class Array {
//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length - 1;

//         while (first < last) {
//             // swap
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         reverse(numbers);
//         // print
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i]);
//         }
//     }
// }





// public class Array{
//     public static int trappedWater(int hight[]){
//         // calculate left max boundary -> array
//         // int n = hight.length;
//         int leftmax[] = new int[hight.length];
//         leftmax[0] = hight[0];
//         for(int i=1; i<hight.length; i++) {
//             leftmax[i] = Math.max(hight[i], leftmax[i-1]);
//         }
//         // calculate right max boundary  -> array  
//         int rigthmax[] = new int[hight.length];
//         rigthmax[hight.length-1] = hight[hight.length-1];
//         for(int i=hight.length-2; i>=0; i--) {
//             rigthmax[i] = Math.max(hight[i], rigthmax[i+1]);
//         }
//         int trappedWater = 0;
//         // loop
//         for(int i=0; i<hight.length; i++) {
//              //water level = min(left max boundary , right max boundarya)
//             int waterLevel = Math.min(leftmax[i], rigthmax[i]);
//             //trapped water = water level - hight [i]
//             trappedWater += waterLevel - hight[i];
//         }
//         return trappedWater ;       
//     }
//     public static void main(String[] args) {
//         int hight[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(trappedWater(hight));
//     }
// }

