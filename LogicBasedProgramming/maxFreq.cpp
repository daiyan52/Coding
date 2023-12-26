#include<stdio.h>
#include<string.h>
int main()
{
    char str[30];
    scanf("%s",str);
    int a[256]={0};
    for(int i=0;str[i];i++)
    {
        a[str[i]]++;
    }
    int i, max=0;
    for(i=0;i<256;i++)
    {
        if(a[i]>a[max])
        {
            max=i;
        }
    }
    printf("%c ",char(max));
}
