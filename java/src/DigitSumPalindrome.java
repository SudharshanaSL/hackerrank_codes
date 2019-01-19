/**
 Write a program to check if the sum of digits of a given number N is a palindrome number or not.

 Input:
 The first line of the input contains T denoting the number of testcases. T testcases follow. Then each of the T lines contains single positive integer N denoting the value of number.

 Output:
 For each testcase, in a new line, output "YES" if pallindrome else "NO". (without the quotes)

 Constraints:
 1 <= T <= 200
 1 <= N <= 1000

 Example:
 Input:
 2
 56
 98
 Output:
 YES
 NO
 */

import java.util.*;
import java.lang.*;

class DigitSumPalindrome {
    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++) {
            int num = in.nextInt();
            int copyNum = num;
            int numSum = 0;
            while(copyNum > 0) {
                numSum += (copyNum%10);
                copyNum /= 10;
            }
            // https://stackoverflow.com/questions/1371149/regex-what-does-mean
            String[] numStr = String.valueOf(numSum).split("(?!^)");
            int strLen = numStr.length;
            boolean isPalindrome = true;
            for(int j = 0; j < (strLen/2); j++) {
                if(!numStr[j].equals(numStr[strLen -1 -j])) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}