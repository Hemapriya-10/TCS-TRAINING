
import java.util.*;
class Segregate01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int [] arr=new int[n];
       for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();

}
int zero=0;int one=0;

for(int i=0;i<n;i++)

{
if(arr[i]==0)
{
zero++;
}
}
for(int i=0;i<zero;i++)
{
arr[i]=0;
}

for(int i=zero; i<n;i++){
arr[i]=1;
}
      for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");

}



    }
}