#include<stdio.h>
int main()
{
	int i=0,n;
	printf("enter the number");
	scanf("%d",&n);
	do
	{
		printf("\n%d",i);
		i=i+2;//i+=2
	}while(i<=3);
}
