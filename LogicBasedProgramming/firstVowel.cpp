#include<stdio.h>
#include<string.h>
int main()
{
    char s[30];
    scanf("%s",s);
    for(int i=0;s[i];i++)
    {
        if(s[i]>='A'&&s[i]<='Z')
        {
            s[i]=s[i]+32;
        }
    }
    for(int i=0;s[i];i++)
    {
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
        {
            printf("%d",i);
            break;
        }
    }
}
