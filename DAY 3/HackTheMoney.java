import java.util.*;

public class HackTheMoney {
    
    static boolean isPossible(long current, long target) {
        if (current == target) {
            return true;
        }
        if (current > target) {
            return false;
        }
        
        return isPossible(current * 10, target) || isPossible(current * 20, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong(); 
                
                if (isPossible(1, n)) {
                    System.out.println("Yes"); 
                } else {
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}