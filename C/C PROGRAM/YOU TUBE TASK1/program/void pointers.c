//generic pointer or void pointer
#include<stdio.h>
int main()
{
	int a[]={10,20};
	void *p;//void access the all data type
	p=&a;//poinet not need &
	printf("%d",&p);
	//printf("%d",*p);error bac the void pointer printing time it declare the data type
	printf("\n%d",*(int*)p);
}
