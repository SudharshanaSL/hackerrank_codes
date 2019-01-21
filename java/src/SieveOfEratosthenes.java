/**
 Given a number N, calculate the prime numbers upto N using Sieve of Eratosthenes.

 Input:
 The first line of the input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing N.

 Output:
 For all testcases, in a new line, print all the prime numbers upto or equal to N.

 Constraints:
 1 <= T<= 100
 1 <= N <= 104

 Example:
 Input:
 2
 10
 35
 Output:
 2 3 5 7
 2 3 5 7 11 13 17 19 23 29 31
 */

import java.util.Scanner;

/**
 * Created by ls on 1/21/2019.
 */
public class SieveOfEratosthenes {
    static boolean[] numbers;

    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0) {
            int N = in.nextInt();
            numbers = new boolean[N+1];
            int i = 2;
            while(i <= N) {
                setMultiplesTrue(i);
                i = getNextFalse(i+1);
            }
            printNonMultiples();
        }
    }

    static void printNonMultiples() {
        for(int i = 2; i < numbers.length; i++) {
            if(!numbers[i])
                System.out.print(i + " ");
        }
        System.out.println();
    }


    static void setMultiplesTrue(int fromWhere) {
        int i = fromWhere;
        while((fromWhere*i) < numbers.length)
            numbers[fromWhere*i++] = true;
    }

    static int getNextFalse(int fromWhere) {
        while(fromWhere < numbers.length) {
            if(!numbers[fromWhere])
                break;
            fromWhere++;
        }
        return fromWhere;
    }
}
