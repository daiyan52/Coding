#include<iostream>
#include<string>
using namespace std;
int main()
{
    string str;
    int wc=0;
    getline(cin,str);
    for(int i=0;str[i]!='\0';i++)
    {
        if(str[i]==' '&& str[i-1]!=' ')
        {
            wc++;
        }
    }
    cout<<wc+1<<endl;
}
