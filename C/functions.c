#include <stdio.h>
/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = dumb_max_of_4(a, b, c, d);
    // printf("%d", ans);
    ans = recursive_max_of_4(a,b,c,d);
    // printf("%d", ans);
    ans = loop_max_of_4(a, b, c, d);
    printf("%d", ans);
    return 0;
}

int loop_max_of_4(int a, int b, int c, int d) {
    int arr[4] = {a,b,c,d};
    int size;
    int result = a;
    for (size = 1; size < 4; size++) {
        result = (arr[size] >= result)? arr[size]: result;
    }
    return result;
}

int dumb_max_of_4(int a, int b, int c, int d) {
    if (a>=b && a>=c && a>=d)
        return a;
    if (b>=a && b>=c && b>=d)
        return b;
    if (c>=a && c>=b && c>=d)
        return c;
    if (d>=a && d>=b && d>=c)
        return d;
    return a;
}

int max(int a, int b) {
    return (a>=b)? a: b;
}

int recursive_max_of_4(int a, int b, int c, int d) {
    return max(a, max(b, max(c,d)));
}
