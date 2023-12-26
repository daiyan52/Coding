#include<iostream>
using namespace std;
int main()
{
    char s1[30],s2[20];
    cin>>s1>>s2;
    int l1=strlen(s1)-1;
    int l2=strlen(s2);
    int c=0;
    for(int i=l2-1;s2[i];i--)
    {
        if(s2[i]==s1[l1])
        {
            c++;
            l1--;
        }
    }
    if(c==l2)
    {
        cout<<"true"<<endl;
    }
    else
    {
        cout<<"false"<<endl;
    }
}
