/**
 Given a Binary Number B, Print its decimal equivalent.

 Input:
 The first line of input contains an integer T denoting the number of test cases. The description of T test cases follow. Each test case contains a single Binary number B.

 Output:
 For each testcase, in a new line, print each Decimal number in new line.

 Constraints:
 1 < T < 100
 1 <= Digits in Binary <= 16

 Example:
 Input:
 2
 10001000
 101100
 Output:
 136
 44
 */

import java.util.Scanner;

/**
 * Created by ls on 1/19/2019.
 */
public class BinaryToDecimal {
    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        while(T > 0) {
            String num = in.nextLine();
            printDecimal(num);
            T--;
        }
    }

    static void printDecimal(String num) {
        long decimal = 0;
        String[] digits = num.split("");
        for(int i = 0; i < digits.length; i++) {
            if(digits[digits.length -1 -i].equals("1"))
                decimal += Math.pow(2, i);
        }
        System.out.println(decimal);
    }
}
