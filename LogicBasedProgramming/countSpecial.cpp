#include<stdio.h>
#include<string.h>
int main()
{
    char str[50];
    scanf("%[^\n]s",str);
    int c=0;
    for(int i=0;str[i]!='\0';i++)
    {
        if((str[i]>='A' && str[i]<='Z')||(str[i]>='a' && str[i]<='z')||(str[i]>='0' && str[i]<='9'))
            continue;
        c++;
    }
    printf("%d\n",c);
}
