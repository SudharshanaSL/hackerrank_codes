/**
For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 33 + 73 + 13 = 371

Input:
First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case contains a positive integer N.

Output:
For each testcase, in a new line, print "Yes" if it is a armstrong number else print "No".

Constraints:
1 <= T <= 31
100 <= N < 1000

Example:
Input:
1
371
Output:
Yes
*/

#include <stdio.h>
#include <math.h>
#include <stdbool.h>

int main() {
	//code
	int T;
	scanf("%d", &T);
	while (T>0) {
	    int n;
	    scanf("%d", &n);
	    isArmstrongNumber(n);
	    T--;
	}
	return 0;
}

void isArmstrongNumber(int n) {
    int num = n;
    int U = (num)%10;
    num = (num)/10;
    int T = (num)%10;
    num = (num)/10;
    int H = (num)%10;
    // printf("%d\t%d\t%d\n", H, T, U);
    // printf("%d\t%d\t%d\n", (int)pow(H, 3), (int)pow(T, 3), (int)pow(U, 3));
    bool isArmstrong = (n == ((int)pow(H, 3) + (int)pow(T, 3) + (int)pow(U, 3)));
    if(isArmstrong)
        printf("Yes\n");
    else
        printf("No\n");
}