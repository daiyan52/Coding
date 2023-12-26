#include<iostream>
using namespace std;
int index(int arr[],int size,int key)
{
	if(size<0)
	{
		return -1;
	}
	if(arr[size]==key)
	{
		return size;
	}
	return index(arr,size-1,key);
}
int main()
{
	int arr[6] = {2,4,6,1,6,8};
	int res = index(arr,5,2);
	cout<<res<<endl;
}