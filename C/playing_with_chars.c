#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char c,s[100],sen[1000];
    scanf("%c", &c);
    scanf("%s", &s);
    scanf("\n");
    scanf("%[^\n]%*c", &sen);
    printf("%c\n%s\n%s", c, s, sen);
    // I/P
    // aaa
    // bbb vvv ccc ddd
    // O/P
    // a
    // aa
    // bbb yyy ccc ddd
    return 0;
}
