#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

void compare_with_k_and_replace(int* v1, int v2, int k) {
    if(v2 > (*v1) && v2 < k)
        *v1 = v2;
}

void calculate_the_maximum(int n, int k) {
  //Write your code here.
    int a,b;
    int mAnd=0, mOr=0, mXor=0;
    for (a = 1; a <= n; a++)
        for (b = a+1; b <= n; b++) {
            compare_with_k_and_replace(&mAnd, a&b, k);
            compare_with_k_and_replace(&mOr, a|b, k);
            compare_with_k_and_replace(&mXor, a^b, k);
        }
    printf("%d\n%d\n%d", mAnd, mOr, mXor);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
