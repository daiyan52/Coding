#include<iostream>
using namespace std;
int main()
{
    int i=0,j=5,k=-1,J,I;
    int sum1=0,sum2=0;
    for(I=i;I<=j;I++)
    {
        sum1 = sum1+I;
    }
    for(J=j-1;J>=k;J--)
    {
        sum2=sum2+J;
    }
    cout<<sum1+sum2;
}
