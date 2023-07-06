#include<stdio.h>
#include<conio.h>
struct student
{
	int rollno;
	char name[10];
	int math,sci,tamil,social,eng,total;
	float avg;
}s;
void main()
{
	printf("\n enter the student rollno");
	scanf("%d",&s.rollno);
	printf("\n enter the student name");
	scanf("%s",&s.name);
	printf("\n enter the student subjectwise mark");
	scanf("%d",&s.math);
	scanf("%d",&s.sci);
	scanf("%d",&s.tamil);
	scanf("%d",&s.social);
	scanf("%d",&s.eng);
	s.total=s.math+s.sci+s.tamil+s.social+s.eng;
	printf("\n total mark %d",s.total);
	s.avg=s.total/5;
	printf("\n average mark %f",s.avg);
	getch();
}
