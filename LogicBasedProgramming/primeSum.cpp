#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cin>>a>>b;
    int i,j,sum=0;
    for(i=a;i<=b;i++)
    {
        int flag=0;
        for(j=2;j<=i/2;j++)
        {
            if(i%j==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0 && i>1)
        {
            sum=sum+i;
        }
    }
    cout<<sum<<endl;
}
