class sortArray
{
public static void main(String[] args)
{
int a[]={4,3,7,5,1,67,8};
int temp;
for(int i=1;i<a.length;i++) 
{
for(int j=i;j>0;j--) 
{
if(a[j]<a[j-1]) 
{
temp=a[j];
a[j]=a[j - 1];
a[j - 1] = temp;
 }
 }
 }
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
}}
}


