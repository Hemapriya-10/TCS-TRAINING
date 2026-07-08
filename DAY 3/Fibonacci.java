import java.util.*;


public class Fibonacci {
static int fibo(int n)
{
    if(n==1)
    {
        return 1;
        
    }
    else if(n==0)
    {
        return 0;
    }
    return fibo(n-1)+fibo(n-2);
}    
public static void main(String[] args)
{
    System.out.println(fibo(6));
}
}
