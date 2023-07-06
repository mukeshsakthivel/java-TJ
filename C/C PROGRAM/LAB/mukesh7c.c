#include<stdio.h>
union employee
{
	int id,salary;
	char name[10],address[20];
	int age;
}emp;
void main()
{
	printf("\n enter employee id ");
	scanf("%d",&emp.id);
	printf("\n enter employee name");
	scanf("%d",&emp.name);
	printf("\n enter employee age");
	scanf("%d",&emp.age);
	printf("\n enter employee salary");
	scanf("%d",&emp.salary);
	printf("\n enter employee address");
	scanf("%d",emp.address);
	getch();
}
