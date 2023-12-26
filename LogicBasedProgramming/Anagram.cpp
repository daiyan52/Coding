#include<stdio.h>
#include<string.h>
int main()
{
    char s1[30],s2[30];
    scanf("%s%s",s1,s2);
    for(int i=0;s1[i];i++)
    {
        for(int j=i+1;s1[j];j++)
        {
            if(s1[i]>s1[j])
            {
                s1[i]=s1[i]^s1[j];
                s1[j]=s1[i]^s1[j];
                s1[i]=s1[i]^s1[j];
            }
        }
    }
    for(int i=0;s2[i];i++)
    {
        for(int j=i+1;s2[j];j++)
        {
            if(s2[i]>s2[j])
            {
                s2[i]=s2[i]^s2[j];
                s2[j]=s2[i]^s2[j];
                s2[i]=s2[i]^s2[j];
            }
        }
    }
    if(strcmp(s1,s2)==0)
        printf("true");
    else
        printf("false");
}
