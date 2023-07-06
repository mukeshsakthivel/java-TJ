//write the program to find the given character is vowels or not using switch case

#include<stdio.h>
int main()
{
	char c,i;
	for(i=0;i<5;i++)
	{
	printf("\nenter the character:");
	scanf("%c",&c);
	switch(c)
	{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':	
		case'E':	
		case'I':	
		case'O':	
		case'U':
		     printf("%c is a vowel",c);
			 break;	
		default:
		    printf("%c is not a vowel",c);		
			break;						
	}
	}
return 0;
}
