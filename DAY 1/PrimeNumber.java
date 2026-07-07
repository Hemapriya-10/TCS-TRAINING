import java.util.*;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int count=0;
        Boolean isPrime=false;
if(n==0 || n==1)
{

System.out.println(n+" is neither a  prime number nor a composite number");

}

for(int i=2;i<n;i++){

if(n%i==0){
count++;
break;
}
}
if(count!=0){
System.out.println(n+" is not  prime number");
}

else{
System.out.println(n+" is prime number");
}       

 }
}



/*
boolean flag=true;
for(int i=2;i*i<=n;i++)
{
if(n%i==0)
{
System.out.println("Not a prime");
flag=false;
break;
}

}
if(flag){
System.out.println("Prime");
}
*/