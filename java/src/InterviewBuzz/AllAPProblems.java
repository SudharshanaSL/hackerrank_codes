package InterviewBuzz;

import java.util.Scanner;

/**
 * Created by ls on 12/31/2018.
 */
public class AllAPProblems {
    public static void main(String[] args) {
        APSeries aps = new APSeries();
        aps.findNthTerm();
    }
}


class APSeries {
    public void findNthTerm() {
        Scanner inp = new Scanner(System.in);
        int firstTerm = inp.nextInt();
        int secondTerm = inp.nextInt();
        int difference = secondTerm - firstTerm;
        int expectedTermPosition = inp.nextInt();
        System.out.println((firstTerm + (expectedTermPosition - 1) * difference));
    }
}
