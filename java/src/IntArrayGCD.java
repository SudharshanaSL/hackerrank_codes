/**
 Given an array of N positive integers. Your task is to find the GCD of all numbers of the array.

 Input:
 First line of input contains number of test cases T. First line of test case contains a positive integer N, size of the array. Next line contains the array elements.

 Output:
 For each testcase, print the GCD of array elements.

 Constraints:
 1 <= T <= 100
 1 <= N <= 106
 1 <= Arr[i] <= 106

 Example:
 Input:
 1
 2
 5 10

 Output:
 5

 Explanation:
 Testcase 1: For array elements 5,10 GCD will be 5.
 */

import java.util.Scanner;

/**
 * Created by ls on 1/21/2019.
 */
public class IntArrayGCD {
    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0) {
            int size = in.nextInt();
            int oldGCD = in.nextInt();
            size -= 1;
            while(size-- > 0) {
                int newNum = in.nextInt();
                oldGCD = GCD(oldGCD, newNum);
            }
            System.out.println(oldGCD);
        }
    }

    static int GCD(int a, int b) {
        int peak = (a >= b)? (b) : (a);
        while(!((a%peak == 0) && (b%peak == 0)))
            peak--;
        return peak;
    }
}
