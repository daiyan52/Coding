#include<iostream>
using namespace std;
void swap(int *a,int *b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
void sort(int arr[],int size)
{
	int min;
	for(int i=0;i<size;i++)
	{
		min=i;
		for(int j=i+1;j<size;j++)
		{
			if(arr[j]<arr[min])
			{
				min=j;
			}
		}
		swap(&arr[min],&arr[i]);
	}
	for(int i=0;i<size;i++)
	{
		cout<<arr[i]<<" ";
	}
}
int main()
{
	int arr[] = {2,-2,0,-11,44,22,33,-1};
	int size = sizeof(arr)/sizeof(arr[0]);
	sort(arr,size);
}