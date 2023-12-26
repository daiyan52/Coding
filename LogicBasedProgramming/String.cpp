//#include <stdio.h>
//#include<string.h>
//int main() {
//    // Write C code here
//    char str[30];
//    scanf("%[^\n]s",str);
//    int len = strlen(str);
//    for(int i=0;i<len;i++)
//    {
//        if( str[i]>='a' && str[i]<='z')
//        {
//            if(str[i+1]==' ')
//            {
//                str[i]=str[i]-32;
//            }
//            str[len]=str[len]-32;
//        }
//    }
//    printf("%s",str);
//    return 0;
//}
#include<iostream>
using namespace std;
int main()
{
    char str1[30],str2[30];
    cin>>str1>>str2;
    int i,j;
    for(i=0;str1[i];i++);
    for(j=0;str2[j];j++);
    if(i!=j)
        cout<<"No"<<endl;
    else
    {
        for(i=0;i<j;i++)
        {
            if(str1[i]!=str2[i])
            {
                break;
            }
        }
        if(i==j)
            cout<<"YES"<<endl;
        else
            cout<<"No"<<endl;
    }
        
}
