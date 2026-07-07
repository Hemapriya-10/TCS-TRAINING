import java.util.*;
public class Anagram {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    if(!(s1.equalsIgnoreCase(s2)))
    {
        System.out.println("Not a anagram");
        sc.close();
        return;
    }
    int[] arr1 = new int[26];
    int[] arr2= new int[26];
    for(int i = 0; i<s1.length();i++)
    {
        arr1[Character.toLowerCase(s1.charAt(i))-'a'+1-1]++;     
        arr2[Character.toLowerCase(s2.charAt(i))-'a'+1-1]++;

    }
    if((Arrays.toString(arr1)).equals(Arrays.toString(arr2)))
    {
        System.out.println("Anagram");
    }
    else
    {
        System.out.println("Not a anagram");
    }
    sc.close();
}
    
}
