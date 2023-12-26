#include<stdio.h>
#include<string.h>
int main()
{
    printf("Enter a sentace\n");
    char str[50];
    scanf("%[^\n]s",str);
    printf("%s",str);
    
}
