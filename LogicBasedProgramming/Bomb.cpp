#include<stdio.h>
#include<string.h>
int main()
{
    char s[30],str2[]="bomb";
    scanf("%[^\n]s",s);
    int flag=0;
    for(int i=0;s[i];i++)
    {
        if((s[i]==str2[0])&&(s[i+1]==str2[1])&&(s[i+2]==str2[2])&&(s[i+3]==str2[3]))
        {
            flag=1;
        }
    }
    if(flag==1)
        printf("DUCK!");
    else
        printf("Relax there is no duck!");
}
