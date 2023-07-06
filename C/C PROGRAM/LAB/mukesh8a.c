#include<stdio.h>
struct student
{
	char name[20];
	int number;
	int math,tamil,eng,social,sci;
};
void main()
{
	struct student stu={"xxx",35,60,90,99,100,100};
	struct student*ptr;
	ptr=&stu;
    printf("NAME%s:",ptr->name);
    printf("\nNUMBER%d:",ptr->number);
    printf("\nMATHAMTICS%d:",ptr->math);
    printf("\nTAMIL%d:",ptr->tamil);
    printf("\nENGLISH%d:",ptr->eng);
    printf("\nSOCIAL SCIENCE%d:",ptr->social);
    printf("\nSCIENCE%d:",ptr->sci);
    getch();
}
