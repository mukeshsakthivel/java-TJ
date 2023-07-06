#include<stdio.h>
int main()
{
	float l,b,r_area,r_peri,r,c_area,cir;
	printf("\n enter the length  & breath");
	scanf("%f%f",&l,&b);
	printf("\n enter radius:");
	scanf("%f",&r);
	r_area=l*b;
	r_peri=(2*(l+b));
	c_area=3.14*r*r;
	cir=3*3.14*r;
	printf("\n area of rectangular: %f",r_area);
    printf("\nperimeter of rectangular %f",r_peri);
    printf("\n area of circle %f",c_area);
    printf("\n circumference of circle %f",cir);
}
