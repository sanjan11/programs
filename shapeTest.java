abstract class shape
{
abstract void noOfSides();
abstract void area();
abstract void perimeter();
}
interface  shape1{
public float pi();
}
class circle extends shape
{
void noOfSides()
{
System.out.println("set sides ");
}
void area()
{
System.out.println("area of circle");
}
void perimeter()
{
System.out.println("perimeter of circle");
}
void radius()
{
System.out.println("radius of circle");
}
}
class circle1 implements shape1
{
public float pi()
{
System.out.println("value of pi =3.14");
return 3.14f;
}}
class shapeTest
{
public static void main(String[] args)
{
circle obj=new circle();
circle1 obj1=new circle1();
obj.noOfSides();
obj.area();
obj.perimeter();
obj.radius();

obj1.pi();
}}