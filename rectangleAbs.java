abstract class shape
{
abstract void noOfSides();
abstract void area();
abstract void perimeter();
}
 class rectangle extands shape
{
 void setSides()
{
System.out.printlln("four sides");
}
void calculatePerimeter()
{
System.out.println("perimeter of rectangle=2(l*b)");
}

void calculateArea()
{
System.out.println("area of rectangle=l*b");
}
}
class abstractRec
{
public static void main(String[] args)
{
shape obj=new rectangleAbs();
obj.setSides();
obj.calculatePerimeter();
obj.calculateArea();
}
}



