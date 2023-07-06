#include<stdio.h>
int main()
{
	float bs,da,hra,gs;
	printf("\n enter the basic salary :");
	scanf("%f",&bs);
	da=bs*0.4;
	hra=bs*0.2;
	gs=bs+da+hra;
	printf("\nbaisc salary:%f",bs);
	printf("\n da:%f",da);
	printf("\nhra:%f",hra);
	printf("\ngross salary:%f",gs);
	return 0;
	
}
