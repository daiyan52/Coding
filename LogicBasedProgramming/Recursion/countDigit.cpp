#include<iostream>
using namespace std;
int countDigit(int n)
{
	if(n>=0 && n<=9)
	{
		return 1;
	}
	int small = countDigit(n/10);
	int count = small + 1;
	return count;
}
int main()
{
	int n;
	cin>>n;
	cout<<countDigit(n);
}