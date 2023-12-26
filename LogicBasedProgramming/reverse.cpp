#include<stdio.h>
#include<string.h>
int main()
{
    int n;
    char s[1000];
    scanf("%d",&n);
    printf("%d",n);
    sprintf(s,"%d",n);
    printf("%c",s[0]);
}
