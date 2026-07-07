import java.util.*;
class NearestPrime {

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
int t=sc.nextInt();
while (t-- >0)
{
int n=sc.nextInt();
int temp1=n,temp2=n;
int prime1=0,prime2=0;
while(true)
{
if(isPrime(--temp1))
{
System.out.println(temp1);
break;
}
else if(isPrime(++temp2))
{
System.out.println(temp2);
break;
}
}

}

    }
}