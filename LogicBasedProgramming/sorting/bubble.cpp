#include<iostream>
using namespace std;
void sort(int arr[],int size)
{
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;j<size-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				// arr[j]=arr[j]^arr[j+1];
// 				arr[j+1]=arr[j]^arr[j+1];
// 				arr[j]=arr[j]^arr[j+1];
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<size;i++)
	{
		cout<<arr[i]<<" ";
	}
}
int main()
{
	int arr[]={2,-22,3,11,-10,32};
	int size = sizeof(arr)/sizeof(arr[0]);
	sort(arr,size);
}