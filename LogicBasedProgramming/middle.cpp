#include<stdio.h>
#include<string.h>
int main()
{
    char s[30];
    scanf("%s",s);
    int len = strlen(s);
    if(len%2==0)
        printf("%c%c",s[len/2-1],s[len/2]);
    else
        printf("%c",s[len/2]);
}
