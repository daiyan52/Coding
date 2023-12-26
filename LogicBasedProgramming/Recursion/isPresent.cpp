#include<iostream>
using namespace std;
bool present(int arr[],int n,int key)
{
	if(n==0)
	{
		return false;
	}
	if(arr[0]==key)
	{
		return true;
	}
	return present(arr+1,n-1,key);
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
	bool b = present(arr,n,3);
	cout<<b<<endl;
}