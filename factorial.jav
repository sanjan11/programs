import java.util.Scanner;
class factorial{
public static void main(String[] args)
{
int fact=1;
Scanner input=new Scanner(System.in);
System.out.println("enter a number");
fact=input.nextInt();
for(int 1=0;i<fact;i++)
{
fact=fact*i;
}
System.out.println("factorial of given number:"+fact);
}}