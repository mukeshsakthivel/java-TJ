//seprate ah  input  to add 
#include<stdio.h>
int main()
{
	int i,n,num,sum=0;
	printf("\nenter the limit");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		printf("/nenter the number");
		scanf("%d",&num);
		sum=sum+num;//sum+=num;
		
	}
	printf("sum=%d",sum);
	
	
}
