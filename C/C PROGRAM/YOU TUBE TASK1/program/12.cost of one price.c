/*
12. if the total selling price of 15 items and the totel profit earned in them is
input through the keyboard,write a program to find the cost price of one item.
eg
total sellng price 200
profit selling id 50
cost of buying item= 200-50=150
cost of one item is=150/15=15
s=selling price
p=profit
c=cost price
*/

#include<stdio.h>
int main()
{
	float s,p,c;
	printf("\n enter the selling price of 15 items :"); // 200
	scanf("%f",&s);
    printf("\n enter the profit :");
    scanf("%f",&p);
    c=(s-p)/15;
    printf("\n cost price of one item is rs %f",c);
    return 0;
	}
