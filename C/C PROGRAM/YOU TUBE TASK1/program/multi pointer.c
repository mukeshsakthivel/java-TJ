#include<stdio.h>
int main()
{
	int a=10,*p,**q,***r;
	p=&a;
	printf("p value %d",p);	
	printf("\np address %d",&p);	
	printf("\np value %d",*p);	
	printf("\n-------------------------------------------------");	
	q=&p;
	printf("\nq value %d",q);	
	printf("\nq value %d",&q);	
	printf("\nq value %d",**q);
	printf("\n-------------------------------------------------");	
	r=&q;
	printf("\nr value %d",r);	
	printf("\nr value %d",*r);	
	printf("\nr value %d",**r);	
	printf("\nr value %d",***r);
	
}
