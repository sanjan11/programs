interface shape
{
public float  pi();
}
class shapeInter implements shape
{
 public float  pi()
{
System.out.println( "value of pi=3.14");
return 0;
}
}
 class shapeContains
{
public static void main(String[] args)
{
shape s=new shapeInter();
s.pi();
System.out.println(s);
}}