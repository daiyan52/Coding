#include<iostream>
using namespace std;
int number_way(int n)
{
    if(n==1 || n==0)
        return 1;
    else
       return number_way(n-1)+number_way(n-2);
}
int main()
{
    int n;
    cin>>n;
    cout<<number_way(n);
}
