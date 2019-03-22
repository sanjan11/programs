class missingNum
{
public static void main(String[] args)
{

int a[]={1,2,3,4,6,7};
 int b=0;
for(int j=0;j<10;j++)
{for(int i=0;i<=a.length;i++)
{if(a[i]!=j)
{
 b=a[i];
break;
}
System.out.println(b);
}}}}
 
