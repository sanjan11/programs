class string
{
public static void main(String[] args)
{
String s="this is string";
int count=1;

for(String c : s.split(" ")){

System.out.println(c+ count++ +" ");
}}}