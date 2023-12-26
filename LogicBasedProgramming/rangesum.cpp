#include<iostream>
using namespace std;
int sumofdigit(int n)
{
    int sum=0;
    while(n!=0)
    {
        sum = sum + n%10;
        n=n/10;
    }
    return sum;
}
int main()
{
    int n1,n2,sum=0;
    cin>>n1>>n2;
    for(int i=n1;i<=n2;i++)
    {
        sum = sum + sumofdigit(i);
    }
    cout<<sum<<endl;
}
