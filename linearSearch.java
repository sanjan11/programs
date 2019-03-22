import java.util.Scanner;
class linearSearch
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5,6,7,8,9,10};
int x;
Scanner input=new Scanner(System.in);
System.out.println("enter the value to be search");
x=input.nextInt();
for(int i=0;i<a.length;i++)
{
if(x==a[i])
{
System.out.println("your search is in the of:" +a[i]);

}

}
}}
