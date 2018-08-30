#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>



int main()
{
    int a, b;
    scanf("%d\n%d", &a, &b);
  	// Complete the code.

    char* represent[10] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int i;

    for(i = a; i <= b; i++)
    {
        if(i<=9 && i>=1)
            printf("%s\n", represent[i]);
        else if(i>9 && i%2 == 0)
            printf("even\n");
        else if(i>9 && i%2 == 1)
            printf("odd\n");
    }
    return 0;
}

