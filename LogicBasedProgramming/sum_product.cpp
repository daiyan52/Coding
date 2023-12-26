#include<iostream>
using namespace std;
int main()
{
    int num;
    cin>>num;
    int a=num%10;
    int b=num/10%10;
    int c=(a+b)+a*b;
    if(c==num)
        cout<<"YEs"<<endl;
    else
        cout<<"No"<<endl;
}
