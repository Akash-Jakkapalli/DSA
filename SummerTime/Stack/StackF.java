// Stock Span Proble
import java.util.*;

public class StackF {
    public static void stockSpan(int stack[], int span[]){
        Stack<Integer>s = new Stack<>();
        span[0]=1; // frist Day is 1
        s.push(0);

        // loop for day by day cal span
        for(int i=1; i<stock.length; i++){
            int currPrice = stock[i];
        }
    }
    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];

        stockSpan(stock, span);

        for(int i=0; i<span.length; i++){
            System.out.println(span[i]+" ");
        }
    }
}
