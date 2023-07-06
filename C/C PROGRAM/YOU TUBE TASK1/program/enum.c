#include<stdio.h>
enum use{a=99,b};
int main()
{
 	enum end{aa,bb};//{0,1}
	enum use c,d;
	enum end e,f;
	e=aa;
	f=bb;
	c=a;
	d=b;
	printf("\n%d",e);
	printf("\n%d",f);
	printf("\n%d",c);
	printf("\n%d",d);
	
}
