#include<stdio.h>
#include<conio.h>
int main()
{
	int a,b,c,d,e,f,g,h,i,sum=0;
	printf("\n enter the five digit number");
	//12345
	scanf("%d",&a);
	b=a/10;//1234
	c=a%10;//5
	d=b/10;//123
	e=b%10;//4
	f=d/10;//12
	g=d%10;//3
	h=f%10;//2
	i=f/10;
	sum=c+e+g+h+i;
	printf("%d",sum);
  
	
	
	
}
 
