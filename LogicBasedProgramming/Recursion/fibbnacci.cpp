#include<iostream>
using namespace std;
int fib(int n)
{
	if(n==0 || n==1)
	{
		return n;
	}
	int a = fib(n-1);
	int b = fib(n-2);
	return a+b;
}
int main()
{
	int n;
	cin>>n;
	for(int i=0;i<=n;i++)
	{
		cout<<fib(i)<<" ";
	}
}