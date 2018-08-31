#include <stdio.h>

#define min(a, b) ((a < b)? a : b)

int min4(int a, int b, int c, int d) {
    return min(a, min(b, min(c, d)));
}

int main() 
{
    int n;
    scanf("%d", &n);
    // max number of cells in a row or column
    int max_count = n * 2 - 1;
    int index_limit = max_count - 1;

    // we are supposed to print from top left to bottom right
    // assume axes intersect at top left - 0,0
    for(int x_axis = 0; x_axis <= index_limit; x_axis++)
    {
        for(int y_axis = 0; y_axis <= index_limit; y_axis++)
        {
            // compute minimum distance from all sides
            // d_left = x_axis, d_right = (index_limit - x_axis)
            // d_top = y_axis, d_bottom = (index_limit - y_axis)
            int min_distance = min4(x_axis, y_axis, index_limit-x_axis, index_limit-y_axis);
            printf("%d ", n-min_distance);
        }
        printf("\n");
    }
    return 0;
}