#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);
  	// Complete the code to print the pattern.
    
    // reach till centre
    int current_number = n, twice_printed, inner_repeat_num;
    while(current_number >= 1) {
        twice_printed = n;
        while(twice_printed > current_number)
            printf("%d ", twice_printed--);
        inner_repeat_num = 1;
        while(inner_repeat_num < 2*current_number) {
            printf("%d ", current_number);
            inner_repeat_num++;
        }
        twice_printed = current_number+1;
        while(twice_printed <= n)
            printf("%d ", twice_printed++);
        current_number--;
        printf("\n");
    }
    
    //grow from centre
    current_number = 2;
    while(current_number <= n) {
        twice_printed = n;
        while(twice_printed > current_number)
            printf("%d ", twice_printed--);
        inner_repeat_num = 1;
        while(inner_repeat_num < 2*current_number) {
            printf("%d ", current_number);
            inner_repeat_num++;
        }
        twice_printed = current_number+1;
        while(twice_printed <= n)
            printf("%d ", twice_printed++);
        current_number++;
        printf("\n");
    }
    return 0;
}