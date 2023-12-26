#include<iostream>
using namespace std;
int fib(int n)
{
	if(n==0)
	{
		return 1;
	}
	int ans = n*fib(n-1);
	return ans;
}
int main()
{
	int n;
	cin>>n;
	int result = fib(n);
	cout<<result<<endl;
}