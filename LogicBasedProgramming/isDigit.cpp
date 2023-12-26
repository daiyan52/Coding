#include<stdio.h>
int main()
{
    char c;
    scanf("%c",&c);
    if(c>='0'&&c<='9')
        printf("digit\n");
    else
        printf("non digit\n");
    
}
