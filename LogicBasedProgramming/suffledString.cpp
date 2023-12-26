#include<stdio.h>
#include<string.h>
int main()
{
    char str[5]={'a','i','o','h','n'};
    int arr[5]={3,1,4,2,0};
    char tstr[5]="\0";
    for(int i=0;i<5;i++)
    {
        tstr[arr[i]]=str[i];
    }
    int len = strlen(tstr);
    printf("%d",len);
    printf("%s",tstr);
}
