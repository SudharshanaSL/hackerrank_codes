/**
 * You are given four numbers num1, den1, num2, and den2. You need to find (num1/den1)+(num2/den2) and output the result in the form of (numx/denx).
 * <p>
 * Input Format:
 * The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains four integers num1, den1, num2, den2 respectively .
 * <p>
 * Output Format:
 * For each test case, in a new line,  output will be the fraction in the form a/b where the fraction denotes the sum of the two given fractions in reduced form.
 * <p>
 * Your Task:
 * Since this is a function problem, you don't need to worry about the testcases. Your task is to complete the function addFraction  which adds the two fractions and prints the resulting fraction. The function takes four arguments num1, den1, num2, den2 where num1, num2 denotes the numerators of two fractions and den1, den2 denotes their denominators.
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 1 <= den1,den2,num1,num2 <= 1000
 * <p>
 * Example:
 * Input
 * 1
 * 1 500 2 500
 * Output
 * 3/500
 * <p>
 * Explanation:
 * In above test case 1/500+2/500=3/500
 * <p>
 * <p>
 * <p>
 * Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
 */


import java.util.*;

public class FractionAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            FractionAdder g = new FractionAdder();
            g.addFraction(a, b, c, d);
            T--;
        }
    }
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete this function*/
class FractionAdder {
    int LCM(int a, int b) {
        int copyA = a;
        int copyB = b;
        while (copyA != copyB) {
            if (copyA < copyB)
                copyA += a;
            else
                copyB += b;
        }
        return copyA;
    }

    int GCD(int a, int b) {
        int smallest = (a > b) ? b : a;
        while (!((a % smallest == 0) && (b % smallest == 0))) {
            smallest--;
        }
        return smallest;
    }

    void addFraction(int num1, int den1, int num2, int den2) {
        // Your code here	
        int resultDenominator = LCM(den1, den2);
        int resultNumerator = num1 * (resultDenominator / den1) + num2 * (resultDenominator / den2);
        int gcd = GCD(resultNumerator, resultDenominator);
        while (gcd != 1) {
            resultNumerator /= gcd;
            resultDenominator /= gcd;
            gcd = GCD(resultNumerator, resultDenominator);
        }
        System.out.println(resultNumerator + "/" + resultDenominator);
    }
}