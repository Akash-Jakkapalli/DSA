package Practice;

public class Pattern {
    public static void main(String[] args) {
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // int n = 5;
        // for(int i = 1; i <= 5; i++){
        //     for(int j = n; j >= i; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
 
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

        // * 
        // * *
        // * * *
        // * * * *
        // * * * * *
    
        int m = 5;
        for(int i=1 ; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
}