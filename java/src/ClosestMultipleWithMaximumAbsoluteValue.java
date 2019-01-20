/**
Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.

Input:
The first line consists of an integer T i.e number of test cases. T testcases follow.  The first and only line of each test case contains two space separated integers N and M.

Output:
For each testcase, in a new line, print the closest number to N which is also divisible by M.

Constraints: 
1 <= T <= 100
-1000 <= N, M <= 1000

Example:
Input:
2
13 4
-15 6
Output:
12
-18
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class ClosestMultipleWithMaximumAbsoluteValue {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T > 0) {
		    T--;
		    int N = in.nextInt();
		    int M = in.nextInt();
		    System.out.println(
		        closestMultipleWithMaximumAbsoluteValue(N, M));
        }
        in.close();
	}
	
	static int closestMultipleWithMaximumAbsoluteValue(int N, int M) {
	    if(N%M == 0) {
	        return N;
	    }
	    int remainder = N % M;
	    int quotient = N/M;
	    int closest1 = quotient*M;
	    int closest2;
	    /**
	    if(N*M < 0)
	        closest2 = M*(quotient - 1);
	    else
	        closest2 = M*(quotient + 1);
        if(Math.abs(N - closest1) < Math.abs(N - closest2))
            return closest1;
        else
            return closest2;
	    */
	    if(remainder < 0)
	        closest2 = closest1 - Math.abs(M);
        else
            closest2 = closest1 + Math.abs(M);
        int diff1 = Math.abs(Math.abs(closest1) - Math.abs(N));
        int diff2 = Math.abs(Math.abs(closest2) - Math.abs(N));
        if(diff1 > diff2)
            return closest2;
        else if(diff2 > diff1)
            return closest1;
        else {
            if(Math.abs(closest1) > Math.abs(closest2))
                return closest1;
            else
                return closest2;
        }
	}
}