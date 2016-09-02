import java.io.*;
class fact
{
public static void main(String args[])
{
int f=1;
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n==0)
System.out.println("Factorial is 1")
else
{
for(int i=1;i<n;i++)
f=f*i;
System.out.println("Factorial is"+f);
}
}
}
