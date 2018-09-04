#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int size;
    int i = 0, sum = 0;
    scanf("%d",&size);
    int *arr = (int*)calloc(size, sizeof(int));
    while(i < size)
        scanf("%d ",&arr[i++]);
    i--;
    while(i >= 0)
        sum += arr[i--];
    // { ( sum += *(arr + i);
    // i--;
    // }
    printf("%d", sum);
    return 0;
}
