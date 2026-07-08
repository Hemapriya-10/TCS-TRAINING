import java.util.*;

public class ReverseString {
    static String Reverse(String str, String rev)
    {
        if(str.length()==0){
            return rev;
        }
        rev += str.charAt(str.length()-1);
        return Reverse(str.substring(0, str.length()-1), rev);
    }
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String rev = "";
    System.out.println(Reverse(str, rev));
}    
}
