class palindrome
{
public static void main(String[] args)
{
String s="sumanth";
int len=s.length();
String rev=" ";
for(int i=len-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
System.out.println(rev);
if(s.equals(rev))
{
System.out.println("palindrome");
}
else{
System.out.println("not palindrome");
}
}}