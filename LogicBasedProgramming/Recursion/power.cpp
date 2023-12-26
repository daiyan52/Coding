#include<iostream>
using namespace std;
int power(int m,int n)
{
	if(n==0)
	{
		return 1;
	}
	int ans = m*power(m,n-1);
	return ans;
}
int main()
{
	cout<<power(2,10);
}