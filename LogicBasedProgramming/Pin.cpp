#include<iostream>
using namespace std;
int min(int a,int b,int c)
{
    if(a<=b&&a<=c)
        return a;
    else if (b<=a&&b<=c)
        return b;
    else
        return c;
}
int maxD(int n)
{
    int m=0;
    while(n!=0)
    {
        if(n%10>m)
            m=n%10;
        n=n/10;
    }
    return m;
}
int max(int a,int b,int c)
{
    if(a>=b&&a>=c)
        return a;
    else if(b>=a&&b>=c)
        return b;
    else
        return c;
}
int main()
{
    int n1,n2,n3;
    cin>>n1>>n2>>n3;
    int d1=min(n1%10,n2%10,n3%10);
    int d2=min(n1/10%10,n2/10%10,n3/10%10);
    int d3=min(n1/100%10,n2/100%10,n3/100%10);
    int d4=max(maxD(n1),maxD(n2),maxD(n3));
    int pin = d4*1000+d3*100+d2*10+d1;
    cout<<pin<<endl;
}
