package ErrorsAndFixes;

/**
 * Created by ls on 11/4/2018.
 */
public class BadOperandForBinaryOperator {
    public static void main(String[] args) {
        // System.out.println("Error occurs here - " + 2 - 3);
        System.out.println("Error does not occur here - " + (2-3));
        // System.out.println("Error occurs here again - " + 2^8);
        System.out.println("Error does not occur - " + (2^8));
    }
}
