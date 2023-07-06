/*
In a town, the percentage of men is 52. the persentage of total literacy is 48. 
if total persentage of literate men is 35 of the total population, write the program 
to find the total number of illiterate men and woman if the populationof town is 80,000.
*/
#include<stdio.h>
int main()
{
	int pop=80000,popmen,popwomen,popliteracy,litmen,litwomen,illitmen,illitwomen;
	popmen		=(52*pop)/100;
	popwomen	=pop-popmen;
	popliteracy =(48*pop)/100;
	litmen		=(35*pop)/100;
	litwomen	=pop-litmen;
	illitmen	=pop-litmen;
	illitwomen	=pop-litwomen;
	
	printf("\ntotal population		  	:%d",pop);
	printf("\ntotal population men	  	:%d",popmen);
	printf("\ntotal population women  	:%d",popwomen);
	printf("\ntotal population litercy	:%d",popliteracy);
	printf("\ntotal litercy men		  	:%d",litmen);
	printf("\ntotal litercy women	  	:%d",litwomen);
	printf("\ntotal illitercy men	  	:%d",illitmen);
	printf("\ntotal illitercy women	  	:%d",illitwomen);
	
	
	return 0;
}
