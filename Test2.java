import java.util.Scanner;
class Test2{
public static void main(String[] args)
{
int n;
Scanner input=new Scanner(System.in);
System.out.println("enter a value");
n=input.nextInt();
if(n%3==0)
{
 System.out.println("fizz");
}
else if(n%5==0)
{
System.out.println("buzz");
}
else if(n%3==0&&n%5==0)
{
System.out.println("fizz buzz");
}
else
{
System.out.println("given number:"+n);
}

}}
