/**
 Write a program to reverse digits of a number N.

 Input:
 The first line of input contains an integer T, denoting the number of test cases. T testcases follow. Each test case contains an integer N.

 Output:
 For each test case, print the reverse digits of number N .

 Constraints:
 1 ≤ T ≤ 100
 1 ≤ N ≤ 109

 Example:
 Input:
 2
 200
 122
 Output:
 2
 221
 */


import java.util.Scanner;

/**
 * Created by ls on 1/19/2019.
 */
public class ReverseNumber {
    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0) {
            T--;
            int num = in.nextInt();
            int reversed = 0;
            while(num > 0) {
                reversed = (reversed * 10) + (num % 10);
                num /= 10;
            }
            System.out.println(reversed);
        }
    }
}
