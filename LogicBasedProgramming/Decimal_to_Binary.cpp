#include<iostream>
using  namespace std;
int main()
{
    int i=0, num,arr[32];
    cin>>num;
    while(num!=0)
    {
        arr[i]=num%2;
        num=num/2;
        i++;
    }
    for(int j=i-1;j>=0;j--)
    {
        cout<<arr[j];
    }
}
