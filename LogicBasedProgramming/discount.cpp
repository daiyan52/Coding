#include<iostream>
using namespace std;
int main()
{
    int bill,discount=0;
    cin>>bill;
    while(bill!=0)
    {
        if((bill%10)%2==1)
            discount=discount+bill%10;
        bill=bill/10;
    }
    cout<<discount<<endl;
}
