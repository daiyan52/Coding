#include<iostream>
using namespace std;
int partition(int arr[],int si,int ei)
{
	int pivot = arr[si];
	int count_smaller=0;
	for(int i=si+1;i<=ei;i++)
	{
		if(arr[i]<=pivot)
		{
			count_smaller++;
		}
	}
	int pivotIndex = count_smaller+si;
	arr[si] = arr[pivotIndex];
	arr[pivotIndex] = pivot;
	int i = si;
	int j=ei;
	while(i<pivotIndex && j>pivotIndex)
	{
		if(arr[i]<=pivot)
		{
			i++;
		}
		else if(arr[j]>pivot){
			j--;
		}
		else{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	return pivotIndex;
}
void quick_sort(int arr[],int si,int ei)
{
	if(si>=ei)
	{
		return;
	}
	int p = partition(arr,si,ei);
	quick_sort(arr,si,p-1);
	quick_sort(arr,p+1,ei);
}
int main()
{
	int arr[] = {2,3,4,1,0,-2,1};
	quick_sort(arr,0,6);
	for(int i=0;i<7;i++)
	{
		cout<<arr[i]<<" ";
	}
}