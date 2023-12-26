#include<stdio.h>
#include<string.h>
int main()
{
    char stones[20],jawells[20];
    scanf("%s%s",stones,jawells);
    int c=0;
    for(int i=0;stones[i]!='\0';i++)
    {
        for(int j=0;jawells[j]!='\0';j++)
        {
            if(stones[i]==jawells[j])
            {
                c++;
            }
        }
    }
    printf("%d",c);
}
