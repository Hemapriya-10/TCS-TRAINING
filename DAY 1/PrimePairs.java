import java.util.*;
class PrimePairs {
public static boolean isPrime(int i)
{
int count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
return true;
}
return false;
}

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int count=0;
for(int i=n;i<=m;i++)
{
int diff=0;
if (isPrime(i) && (i+6 <=m && isPrime (i+6)))
{
System.out.println(i + " "+ (i+6));
count++;
}
}

System.out.println(count);
}
}