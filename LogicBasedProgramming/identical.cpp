#include<iostream>
using namespace std;
int main()
{
    char str[30],flag=0;
    cin>>str;
    for(int i=0;str[i];i++)
    {
        if(str[i]==str[i+1])
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
        cout<<"true"<<endl;
    else
        cout<<"false"<<endl;
}
