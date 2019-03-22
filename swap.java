class swap
{
void fun1()
{
int a=2;
int b=3;
int c=0;
c=a;
a=b;
b=c;
System.out.println("swaped number using third var :a,b:" +a+  " "+  +b); 
}
void fun2()
{
int a=3;
int b=4;
 a=a+b;
 b=a-b;
a=a-b;
System.out.println("swaped numbers whith out using third var:a,b:" +a  +"  " +  +b);
}
public static void main(String[] args)
{
swap obj=new swap();
obj.fun1();

obj.fun2();
}
} 
