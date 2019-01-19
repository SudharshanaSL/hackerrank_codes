/**
Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

Input:
The first line of the input contains T denoting the number of testcases. T testcases follow. First line of the test case will be the value of n and r respectively.

Output:
For each test case, in a new line, output will be the value of nPr.

Constraints:
1 <= T <= 100
1 <= n,r <= 20
n >= r

Example:
Input:
2
2 1
10 4
Output:
2
5040
 */
import java.util.Scanner;

/**
 * Created by ls on 1/19/2019.
 */
public class PermutationNPR {
    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0) {
            int N = in.nextInt();
            int R = in.nextInt();
            System.out.println(factorial(N)/factorial(N-R));
            T--;
        }
    }

    static long factorial(int num) {
        if(num == 0 || num == 1)
            return 1;
        long result = 1;
        for(int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
