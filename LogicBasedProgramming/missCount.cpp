#include<stdio.h>
#include<string.h>
#define isEng(ch)   (ch>='A'&& ch<='Z') || (ch>='a' && ch<='z')
#define isDigit(ch)  ch>='0' && ch<='9'
int main()
{
    char str[30];
    scanf("%[^\n]s",str);
    int c=0;
    for(int i=0;i<str[i]!='\0';i++)
    {
        if(isEng(str[i]) || isDigit(str[i]) || str[i]==' ')
            continue;
        c++;
    }
    printf("%d",c);
}
