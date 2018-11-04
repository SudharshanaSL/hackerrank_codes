package MaxXorTripletInIntArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ls on 11/4/2018.
 */
public class MyXorIntArray {

    List<Integer> nums;
    Runtime rt;

    public MyXorIntArray() {
        nums = new ArrayList<Integer>();
        rt = Runtime.getRuntime();
    }

    long optimized() {
        System.out.println("set optimized - ");
        Integer result = Integer.MIN_VALUE;
        // reduce duplication in xor results - use a set
//        long start = System.nanoTime();
        long maxMemUsed = rt.totalMemory() - rt.freeMemory();
        Set<Integer> newNums = new HashSet<Integer>(nums);
        Set<Integer> xorSums = new HashSet<Integer>();
        for (int i : newNums) {
            for (int j : newNums) {
                xorSums.add(i ^ j);
                maxMemUsed = Math.max(rt.totalMemory() - rt.freeMemory(), maxMemUsed);
            }
        } // O(n^2)
        for (int i : newNums) {
            for (Integer j : xorSums) {
                result = Math.max(result, i ^ j);
                maxMemUsed = Math.max(rt.totalMemory() - rt.freeMemory(), maxMemUsed);
            }
        }
//        long stop = System.nanoTime();
//        System.out.println("Time taken - " + (stop - start));
        System.out.println("Result - " + result);
        System.out.println("Max memory consumed - " + maxMemUsed);
//        return (stop -start);
        return maxMemUsed;
    }

    long bruteForced() {
        System.out.println("bruteforced - ");
        Integer result = new Integer(Integer.MIN_VALUE);
//        long start = System.nanoTime();
        long maxMemUsed = rt.totalMemory() - rt.freeMemory();
        for (int i : nums) {
            for (int j : nums) {
                for (int k : nums) {
                    result = Math.max(i ^ j ^ k, result);
                    maxMemUsed = Math.max(rt.totalMemory() - rt.freeMemory(), maxMemUsed);
                }
            }
        } // O(n^3)
//        long stop = System.nanoTime();
//        System.out.println("Time taken - " + (stop - start));
        System.out.println("Result - " + result);
        System.out.println("Max memory consumed - " + maxMemUsed);
        System.out.println("***************************************");
//        return (stop -start);
        return maxMemUsed;
    }
}
