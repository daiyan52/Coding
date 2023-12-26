#include<iostream>
using namespace std;
int index(int arr[],int size,int x)
{
	if(size==0)
	{
		return -1;
	}
	if(arr[0]==x)
	{
		return 0;
	}
	int ans = index(arr+1,size-1,x);
	return ans+1;
}
int main()
{
	int arr[5]={3,2,5,2,15};
	int res = index(arr,5,5);
	cout<<res<<endl;
}