#include<stdio.h>
#include<string.h>
int main()
{
    char s[30];
    scanf("%s",s);
    int A[126]={0};
    for(int i=0;s[i];i++)
    {
        A[s[i]]=1;
    }
    for(int i=0;i<126;i++)
    {
        if(A[i]>0)
        {
            printf("%c",i);
        }
    }
}
