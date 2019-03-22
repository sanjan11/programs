abstract class shape
{
abstract void noOfSides();
abstract void area();
abstract void perimeter();
}
 class rectangle extends shape
{
 void noOfSides()
{
System.out.println("four sides");
}
void perimeter()
{
System.out.println("perimeter of rectangle=2(l*b)");
}

void area()
{
System.out.println("area of rectangle=l*b");
}
}
class abstractRec
{
public static void main(String[] args)
{
shape obj=new rectangle();
obj.noOfSides();
obj.perimeter();
obj.area();
}
}



