/**
 For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.

 Input:
 First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case should contain a positive integer N.

 Output:
 For each testcase, in a new line, print "Yes" if it is a prime number else print "No".

 Constraints:
 1 <= T <= 30
 1 <= N <= 100

 Example:
 Input:
 1
 5
 Output:
 Yes
 */

import java.util.Scanner;

 public class PrimeNumber {
    public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0) {
            int N = in.nextInt();
            T--;
            isPrime(N);
        }
        in.close();
    }

    static void isPrime(int num) {
        if(num == 1 || num == 2 || num == 3) {
            System.out.println("Yes");
            return;
        }
        int numFactors = 0;
        for(int i = 1; i <= num; i++) {
            if(num%i == 0)
                numFactors += 1;
        }
        if(numFactors > 2)
            System.out.println("No");
        else
            System.out.println("Yes");
	}
 }