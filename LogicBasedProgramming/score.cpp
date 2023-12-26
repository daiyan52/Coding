#include<iostream>
using namespace std;
int main()
{
    char s[30];
    cin>>s;
    int arr[3]={0};
    for(int i=0;i<s[i];i++)
    {
        if(s[i]=='A')
        {
            arr[0]++;
        }
        if(s[i]=='B')
        {
            arr[1]++;
        }
        if(s[i]=='C')
        {
            arr[2]++;
        }
    }
    cout<<arr[0]<<" "<<arr[1]<<" "<<arr[2];
}
