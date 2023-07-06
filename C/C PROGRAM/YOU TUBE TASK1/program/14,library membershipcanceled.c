
/*
a library charge a fine 
*/
#include<stdio.h>
int main()
{
	int days;
	printf("\nenter the days");
	scanf("%d",&days);
	if(days>=1&&days<=5)
	{
		printf("\nfine amount 0.50 paisa");
	}
	else if(days>=6&&days<=10)
	{
		printf("\nfine amount 1 rupees");
	}
	 else if(days>=11&&days<=29)
	{
		printf("\nfine amount 5 rupees");
	}
	 else 
	{
		printf("membership will be cancelled");
	}
	
}
