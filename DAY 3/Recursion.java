import java.util.*;

public class Recursion {

   static void any(int n)
   {
    if(n==0)
        return;
    any(n-1);
    System.out.println(n);
   }
   public static void main(String[] args) {
    any(5);
    }
    
}
