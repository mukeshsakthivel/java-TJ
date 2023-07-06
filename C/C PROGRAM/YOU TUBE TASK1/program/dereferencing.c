#include<stdio.h>
int main()
{
	int a=10,*p;
	p=&a;
	printf("p value %d",p);	
	printf("\np value %d",*p);	
}
