#include<stdio.h>
#include<conio.h>
void main()
{
int a[10];
int i,j,n;
printf("Enter the limit");
scanf("%d",&n);
printf("Enter the numbers");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
for(i=0;i<n;i++)
{
for(j=i+1;j,n;j++)
{
if(a[i]==a[j])
goto a;
}
}
a:
printf("%d",a[i]);
getch();
}
