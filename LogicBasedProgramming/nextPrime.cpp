#include<iostream>
using namespace std;
int isPrime(int n)
{
    int flag=0;
    for(int i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==0 && n>1)
        return 1;
    else
        return 0;
}
int main()
{
    int n;
    cin>>n;
    while(1){
        if(isPrime(n))
        {
            cout<<n<<endl;
            break;
        }
        n++;
    }
}
