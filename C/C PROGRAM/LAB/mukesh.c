#include<stdio.h>
#include<conio.h>
struct add
{
	int a,b,add,sub,mul;
	float div;
}cal;
void main()
{
	printf("\n enter the value of a and b ");
	scanf("%d",&cal.a);
	scanf("&d",&cal.b);
    cal.add=cal.a+cal.b;
    printf("\n addition %d",cal.add);
    cal.sub=cal.a-cal.b;
    printf("\n subtraction %d",cal.sub);
    cal.mul=cal.a*cal.b;
    printf("\n multiplication %d",cal.mul);
    cal.div=cal.a/cal.b;
    printf("\n division %f",cal.div);
    getch();
}

