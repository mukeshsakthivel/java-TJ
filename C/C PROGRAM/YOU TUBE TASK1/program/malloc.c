//malloc 
//void*malloc(size_t size) eg i give 5 element in int type it(5*4)it allocate the 20 bit values
#include<stdio.h>
int main()
{
	int n,i;
	printf("enter the limit :");
	scanf("%d",&n);
	int *p=malloc(n*sizeof(int));
	printf("\ndummy value like garbage");
	for(i=0;i<n;i++)
	{
		printf("%d   ",p);
	}
	for(i=0;i<n;i++)
	{
		printf("\nenter the value");
		scanf("%d",p+i);
	}
	for(i=0;i<n;i++)
	{
		printf("\n%d",*(p+i));
	}
}

















