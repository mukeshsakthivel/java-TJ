#include<stdio.h>
int main()
{
	int n,a,b,d1,d2,d3;
	printf("\nenter the 3 digit number:");
	scanf("%d",&n);
	a=n/10;             //153/10=15	
	d3=n%10;			//153%10=3
	d2=a%10;			//		=5
	d1=a/10;			//		=1
	b=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
	if(b==n)
	{
		printf("%d is an armstrong no ",n);
	}
	else
	{
		printf("%d is not an armstrong no",n);
	}
}
