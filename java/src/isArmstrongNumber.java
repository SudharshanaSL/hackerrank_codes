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

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
		    int N = in.nextInt();
		    isArmstrong(N);
		}
	}
	
	static void isArmstrong(int n) {
	    int U = n % 10;
	    int T = (n % 100)/10;
	    int H = (n % 1000)/100;
	    if(n == ((Math.pow(H, 3)) + (Math.pow(T, 3)) + (Math.pow(U, 3))))
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	}
}