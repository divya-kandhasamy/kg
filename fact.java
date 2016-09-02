import java.io.*;
class fact
{
public static void main(String args[])
{
int f=1;
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<n;i++)
f=f*i;
System.out.println("Factorial is"+f);
}
}
