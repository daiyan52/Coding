#include<iostream>
using namespace std;
int sum(int n)
{
	if(n==1 || n ==0 )
	{
		return n;
	}
	int ans = n + sum(n-1);
	return ans;
}
int main()
{
	int n;
	cin>>n;
	int res = sum(n);
	cout<<res<<endl;
}