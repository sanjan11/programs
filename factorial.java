import java.util.Scanner;
class factorial{
public static void main(String[] args)
{
int fact=1;
int n;
Scanner input=new Scanner(System.in);
System.out.println("enter a number");
n=input.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial of given number:"+fact);
}}