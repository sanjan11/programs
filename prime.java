class prime{
public static void main(String args[])
{
int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
for(int i=0;i<a.length;i++)
{
boolean isPrime=true;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
isPrime=false;
break;
}
}
if(isPrime)
{
System.out.println("prime numbers are:"+i);
}
}
}
}