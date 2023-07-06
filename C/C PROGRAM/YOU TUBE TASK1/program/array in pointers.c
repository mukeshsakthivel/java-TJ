/*in arry the poiter will take first address of the arry 
if increase the valu to move next address and desriment will come previous address*/
#include<stdio.h>
int main()
{
	int i=0,a[]={10,20,30};//one valu have 4 bit
	int *b;
	b=&a;
	printf("size of a %d",sizeof(a));// totallly have 3 values so 4*3=12
	printf("\n%d",b);
	printf("\n%d",*b);
	b++;
	printf("\n%d",b);
	printf("\n%d",*b);
	//b++;or
	printf("\n%d",b);
	printf("\n%d",++*b);
	do{
	printf("\n%db",b);
	printf("\n%d*b",*b);
	}while(i>0);
	printf("\n%d*++b",*++b);
	printf("\n%d++*b",++*b);
}
