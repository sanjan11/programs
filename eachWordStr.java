class eachWordStr
{
public static void main(String[] args)
{
String str=" welcome to java";
int len=str.length();
String rev=" ";
for(int i=len-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
System.out.println(rev);
}}