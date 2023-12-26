#include<stdio.h>
#include<string.h>
int main()
{
    char month[30];
    int day;
    scanf("%s",month);
    scanf("%d",&day);
    if(strcmp(month,"july")==0 && day==5)
        printf("1");
    else
        printf("0");
}
