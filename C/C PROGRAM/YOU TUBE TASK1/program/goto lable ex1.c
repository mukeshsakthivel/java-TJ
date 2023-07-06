#include<stdio.h>
int main()
{
	int i=0;
	mukesh:
	printf("\n%d",i);
	i++;
	if(i!=5)
	{
		goto mukesh;
	}
	printf("\nend");
	
	
	return 0;
}
