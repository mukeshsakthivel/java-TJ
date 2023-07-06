#include<stdio.h>
int main()
{
	int ch,qty,i,tot=0;
	mukesh:
	printf("\nmenu card");
	printf("\n1.coffee		RS:15");
	printf("\n2.tea			RS:10");
	printf("\n3.cold coffee		RS:25");
	printf("\n4.milk shake		RS:50");
	printf("\n\n enter the choice :");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:
			printf("\nyou have selected coffee");
			printf("\nenter the qty:");
			scanf("%d",&qty);
			tot=tot+(qty*15);
			break;
		case 2:
			printf("\nyou have selected tea");
			printf("\nenter the qty:");
			scanf("%d",&qty);
			tot=tot+(qty*10);
			break;		
		case 3:
			printf("\nyou have selected cold coffee");
			printf("\nenter the qty:");
			scanf("%d",&qty);
			tot=tot+(qty*25);
			break;
		case 4:
			printf("\nyou have selected milk shake");
			printf("\nenter the qty:");
			scanf("%d",&qty);
			tot=tot+(qty*50);
			break;
		default:
			printf("\ninvalid product selection");
			break;
	}
	
	printf("do you want to continue press 1");
	scanf("%d",&i);
	if(i==1)
	{
		goto mukesh;
	}
	printf("\n total amount:%d",tot);
	printf("\nthank you come again ");
}
