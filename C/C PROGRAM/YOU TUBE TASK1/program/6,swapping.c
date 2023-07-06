#include<stdio.h>
int main()
{
	int c,d,b;
	printf("\n enter the two number");
	scanff("%d%d",&c,&d);
	b=c;
	c=d;
	d=b;
	printf("c:&d d:%d",c,d);
	return 0;
}
