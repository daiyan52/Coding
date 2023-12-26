#include<stdio.h>
#include<string.h>
#define isChar(ch)  ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
#define isDigit(ch)  (ch>='0' && ch<='9')
int main()
{
    char str[30];
    scanf("%[^\n]s",str);
    int i;
    for(i=0;str[i]!='\0' && isChar(str[i]);i++);
    if(i==0 && isDigit(str[i]) || i==0 && str[i]=='_')
        printf("Invalid\n");
    else if (isDigit(str[i]))
    {
        i++;
        if(str[i]!='-' && strcmp(str+i,"@gmail.com")==0)
            printf("Valid\n");
        else
            printf("Invalid\n");
    }
    else if(str[i]=='_' && strcmp(str+i+1,"@gmail.com")==0)
        printf("Valid\n");
    else
        printf("Invalid\n");
}
