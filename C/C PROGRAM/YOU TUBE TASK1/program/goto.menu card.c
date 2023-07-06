#include<stdio.h>
int main()
{
	int ch,qty,i,net=0;
	serventmukesh:
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
		    net=net+(qty*15);
			break;
		case 2:
			printf("\nyou have selected tea");
			printf("\nenter the qty:");
			scanf("%d",&qty);
			net=net+(qty*10);
			break;		
		case 3:
			printf("\nyou have selected cold coffee");
			printf("\nenter the qty:");
			scanf("%d",&qty);
			net=net+(qty*25);
			break;
		case 4:
			printf("\nyou have selected milk shake");
			printf("\nenter the qty:");
			scanf("%d",&qty);
			net=net+(qty*50);
			break;
		default:
			printf("\ninvalid product selection");
			break;
	}
	printf("\ndo you want order another press 1:");
	scanf("%d",&i);
	if(i==1)
	{	
		goto serventmukesh;
	}
	printf("total amount:%d",net);
	printf("\nthank you\ncome again");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
