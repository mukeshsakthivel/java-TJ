#include<stdio.h>
int main()
{
	int a,b,c,d,e,f,g,h,i,j,k=0,reverse;
	printf("\n enter the  number");
	scanf("%d",&a);
	b=a/10;
	c=a%10;	
  	d=b/10;
	e=b%10;
	f=d/10;
	g=d%10;
	h=f/10;
	i=f%10;
	reverse=(c*10000)+(e*1000)+(g*100)+(i*10)+(h*1);
	printf("reverse of number %d",reverse);
	while(a!=0)
	{
		j=a%10;
		k=k*10+j;
		a=a/10;
	}
		printf("reverse of number %d",k);
	return 0;
	
	
}
 
