#include<iostream>
using namespace std;
bool isSorted(int arr[],int n)
{
	if(n==0 || n==1)
	{
		return true;
	}
	if(arr[0]>arr[1])
	{
		return false;
	}
	bool b = isSorted(arr,n-1);
	return b;
}
int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	bool b = isSorted(arr,n);
	cout<<b;
}