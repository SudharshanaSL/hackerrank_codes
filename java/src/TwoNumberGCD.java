/**
 Given two numbers A and B, find the GCD of those 2 numbers.

 Input:
 The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two space separated integers A and B.

 Output:
 For each testcase, in a new line, print the GCD of the two numbers.

 Constraints:
 1 <= T <= 100
 1 <= A, B <= 1000

 Example:
 Input:
 98 56
 48 18
 Output:
 14
 6
 */

import java.util.Scanner;

/**
 * Created by ls on 1/19/2019.
 */
public class TwoNumberGCD {
    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0) {
            T--;
            int A = in.nextInt();
            int B = in.nextInt();
            int min = minFour(A, B, A/2, B/2);
            int gcd = 1;
            for(int i = 1; i <= min; i++) {
                if((A%i == 0) &&
                        (B%i == 0))
                    gcd = i;
            }
            System.out.println(gcd);
        }
    }

    static int minTwo(int a, int b) {
        return (a >= b)? a:b;
    }

    static int minFour(int a, int b, int c, int d) {
        return minTwo(a, minTwo(b, minTwo(c, d)));
    }

}
