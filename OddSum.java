import java.util.*;
class OddSum
{
public static void main(String args[])
{
int range,sum=0;
Scanner sc=new Scanner(System.in);
range=sc.nextInt();
for(int i=0;i<=range;i++)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.println(sum);
}
}
