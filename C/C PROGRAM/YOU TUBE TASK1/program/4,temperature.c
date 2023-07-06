#include<stdio.h>
int main()
{
	float f,c;
	printf("\n enter the temperature:");
	scanf("%f",&f);
	c=(f-32)*(5.0/9.0);
	printf("\n result %f",c);
	return 0;
}
