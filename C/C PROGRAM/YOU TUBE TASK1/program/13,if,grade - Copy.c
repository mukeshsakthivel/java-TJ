/*
school result management 
1.five marks input through the keyboard
2.find total and average of the given marks
3.find the result whether the given marks must be >=35
4.grade as per the following condition
          90-100-A GRADE
          80-89 -B GRADE
          70-79 -C GRADE
          <70   -D GRADE
		  FAIL  -NO GRADE
*/

#include<stdio.h>
int main()
{
	int m1,m2,m3,m4,m5,total;
	float avg;
	printf("\n enter the five mark:\n");
	scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);
	total=m1+m2+m3+m4+m5;
	avg=total/5.0;
	printf("\ntotal %d:",total);
	printf("\naverage  %f:",avg);
	if(m1>=35&&m2>=35&&m3>=35&&m4>=35&&m5>=35)
	{
	
	   	{
	   		printf("\n result:pass");
		}

				
	if(avg>=90&&avg<=100)
		{
			printf("\n grade:a grade"); 
		}	
	else if(avg>=80&&avg<=90)
		{
			printf("\n grade:b grade"); 
		}
	else if (avg>=70&&avg<=79)
		{
			printf("\n grade:c grade"); 
		}
	else
		{
			printf("\n grade:d grade"); 
		}
    }
     else
	{
		
			printf("/n result:fail");		
			printf("/n grade:no grade");		
 }
}
			  
