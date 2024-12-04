public class RecursionBasics {

    // Print numbers from n to 1 (Decresing)--> (n=10)

    public static void printDec(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);     
    }

    // Print numbers from n to 1 (Increasing)--> (n=10)

    public static void printInc(int n){
        if (n==1) {
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1); 
        System.out.print(n + " ");
    }


    // Print Factorial of a num n --> (n=5)
    public static int fact(int n ){
        if (n==0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
        
    }


    // print sum of first n natural num
    public static int calSum(int n){
        if (n==1) {
            return 1;
        }
        int Snm1 = calSum(n-1);
        int sn = n + Snm1;
        return sn;
    }


    // print Nth Fibobacci num
    public static int fibo(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }



    // print given array is Sorted or not
    public static boolean isSorted(int arr[], int i){
        if (i==arr.length-1) {
            return true; 
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1 );
    }



    // WAP to find the First occurence of an array
    public static int firstOccurence(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;  
        }
        return firstOccurence(arr, key, i+1);
    }



    // Power (2^10) 
    public static int power(int x, int n){
        if (n==0) {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;  
    }



    //Optimized Power  (2^10)
    public static int optimizedPow(int x, int n){
        if (n==0) {
            return 1;
        } 
        int halfPow = optimizedPow(x, n/2);
        int halfPowSqr = halfPow * halfPow;

        // Odd
        if (n % 2 != 0) {
            halfPowSqr = x * halfPowSqr;
        }
        return halfPowSqr;
    }


    // Tiling Problem
    public static int tilingProblem(int n){   // 2 x n (floor size )
        // base case
        if (n==0 || n==1) {
            return 1;
        }
        // Kaam
        // vertical choice
        int fnm1  = tilingProblem(n-1);

        // horizontal choise
        int fnm2 = tilingProblem(n-2); 
        // total ways
        int totalWays = fnm1 + fnm2;

        return totalWays;         
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        // int n = 0;
        // printDec(n);
        // printInc(n);
        // System.out.println(calSum(n));
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 8 , 0));

        // System.out.println(power(2, 5));

        //Optimized Power  (2^10)
        // int x = 2;
        // int n = 10;
        // System.out.println(optimizedPow(x, n));

        // Tiling Problem ---->
        // System.out.println(tilingProblem(4));

        System.out.println(fact(5));


         


    

    }
}
