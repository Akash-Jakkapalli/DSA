// import java.util.Scanner;

// import javax.print.DocFlavor.STRING;

public class Strings {

    // CharAt
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Input Output ->

        // String str = "abcde";
        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.nextLine();
        // System.out.println(name);

        // String Length ->

        String FullName = "Akash Jakkapalli";
        System.out.println(FullName.length());

        // Conatenation ->
        // Joning two Strings

        String firstName = "AKASH";
        String lastName = "JAKKAPALLI";

        String fullName = firstName +" "+ lastName;
        // System.out.println(fullName);

        printLetters(fullName);
    }


    //------------------------------------------------------------------------------------------------------------------>
    // Check if String is Palindrome
    // "noon" , "madam" , "racecar"
    // public static boolean isPalindrome(String str){
    //     for(int i=0; i<str.length()/2; i++){
    //         int n = str.length();
    //         if (str.charAt(i) != str.charAt(n-i-1)) {
    //             // not palindrome
    //             return false;             
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     String str = "mom";
    //     System.out.println(isPalindrome(str));
    // }    
    
    //------------------------------------------------------------------------------------------------------------------>
    // Shortest Path
    // public static float getShortestPath(String path){
    //     int x = 0 , y = 0;
    //     for(int i=0; i<path.length(); i++){
    //         char dir = path.charAt(i); 
    //         // cases
    //         // South
    //          if (dir == 'S') {
    //             y--;
    //             // North
    //          }else if (dir == 'N') {
    //             y++; 
    //             //West               
    //          }else if (dir == 'W') {
    //             x--;
    //             //East
    //          }else{
    //             x++;
    //          }         
    //     }
    //     int X2 = x*x;
    //     int Y2 = y*y;
    //     return (float)Math.sqrt(X2+Y2);
    // } 

    // public static void main(String[] args) {
    //     String path = "WNEENESENNN";
    //     System.out.println(getShortestPath(path));
    // }
        
    // Print Larger String

    // public static void main(String[] args) {
    //     String fruits[] = {"appale","mango","banana",};
    //     String largest = fruits[0];
    //     for(int i=1; i<fruits.length; i++){
    //         if (largest.compareTo(fruits[i])<0) {
    //             largest = fruits[i];
    //         }
    //     }
    //     System.out.println(largest);
    // }


    //------------------------------------------------------------------------------------------------------------------>
    // String Builder

    //  public static void main(String[] args) {
    //     StringBuilder sb = new StringBuilder("");
    //         for(char ch='a'; ch<='z'; ch++){
    //             sb.append(ch);
    //         }
    //         System.out.println(sb.length());
    //     }
        
    
    //------------------------------------------------------------------------------------------------------------------>
    // Convert First letter as UpperCase
    // public static void main(String[] args) {
    //     String str = "hi, i am akash"; 
         
    //}
}
    

