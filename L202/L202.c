#include <stdio.h>
#include <stdbool.h>

int next(int);
bool isHappy(int);

int main(int argc, char *argv[]) 
{
	int n = 2;
	printf("%d\n", isHappy(n));
}


bool isHappy(int n)
{
	int pt1 = next(n), pt2 =  next(next(n));
	while(1)
	{
		if(pt2 == 1 || pt1 == 1)
		{
			return 1;
		} 
		else if  (pt1 ==pt2)
		{
			return 0;
		}
		pt1 = next(pt1);
		pt2 = next(next(pt2));
	}
	
}

int next(int n)
{
	return (n/10 ) ? (n%10)*(n%10) + next(n/10) : n*n ;
}