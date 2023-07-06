#include<stdio.h>
int main()
{
	int a=1,*p,b;
	p=&a;
	printf("size of a %d",sizeof(a));
	printf("\naddress %d",&a);
	printf("\npointer %d",*p);
	b=p+1;//one int value is 4 bit if increase the vale int increase 4 bit for every increment 
	printf("\nincrement %d",b);
}
