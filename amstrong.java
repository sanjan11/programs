import java.util.Scanner;
class amstrong
{
public static void main(String[] args)
{
int n;
int a=0;
int b=0;
int temp=0;
Scanner input=new Scanner(System.in);
System.out.println("enter a value");
n=input.nextInt();
temp=n;
while(n!=0)
{
a=n%10;
b=b+a*a*a;
n=n/10;
}
if(b==temp)
{
System.out.println("given number is  amstrong");
}
else
{
System.out.println("given number is not amstrong");
}
}}