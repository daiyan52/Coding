#include<iostream>
using namespace std;
int main()
{
    int num,sum=0;
    cin>>num;
    while(num!=0)
    {
        int rem = num%10;
        if(rem==2 || rem==3 || rem==5 || rem==7){
            sum = sum + rem;
        }
        num=num/10;
    }
    cout<<sum<<endl;
}
