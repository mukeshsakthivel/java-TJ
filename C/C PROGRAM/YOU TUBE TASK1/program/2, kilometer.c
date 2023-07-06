#include <stdio.h>
int main()
{
	float km,m,cm,in,ft;
	printf("enter the total kilometer:");
	scanf("%f",&km);
	m=km*1000;
	cm=m*100;
	in=cm/2.54;
	ft=in/12;
	printf("\n km = %0.3f",km);
	printf("\n m = %0.3f",m);
	printf("\n cm = %0.3f",cm);
	printf("\n i = %0.3f",in);
	printf("\n ft = %0.3f",ft);
	return 0;	
}
