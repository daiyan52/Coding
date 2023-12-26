#include<stdio.h>
#include<string.h>
int main()
{
    char str[30];
    scanf("%s",str);
    int len,i;
    for(len=0;str[len]!='\0';len++);
    printf("%d",len);
    for(i=0;i<len;i++)
    {
        if(str[i]!=str[len-i-1])
        {
            break;
        }
    }
    if(i==len)
        printf("Yes");
    else
        printf("No");
}
