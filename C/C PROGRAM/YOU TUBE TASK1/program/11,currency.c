/*
cashier has currency notes of denomination 10,50 0and 100. if the amount to be withdrawn
is input through the keyboard in hundreds. to find the total number of currency notes 
of each denomination the cashier will have to give to the withdrawn
eg
1275
100*12=>1200
50*1  =>50
10*2  =>20
change  5
*/
#include<stdio.h>
int main()
{
	int amount;
	printf("/n enter the amount of withdraw :");
	scanf("%d",&amount);
	printf("\n required notes of rs 100:%d",(amount/100));      //(1275/100)=12  rem is 75
	printf("\n required notes of rs 50 :%d",(amount%100)/50);   //(75/50)=1      rem is 25
	printf("\n required notes of rs 10 :%d",(amount%100)%50/10);//(25/10)=2      rem is 5
	printf("\n amount still remining   :%d",(amount%100)%50%10);//             	 rem is 5
	return 0;

	
}

