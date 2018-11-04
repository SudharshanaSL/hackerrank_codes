import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Given an array of integers find the maximum XOR output for a triplet of integers from the array
 */
public class MaxXorTriplet {

    public static void main(String[] args) throws Exception {
        BufferedReader inputFile = new BufferedReader(new FileReader(new File(args[0])));
        String line;
        MyXorIntArray xorIntArray = new MyXorIntArray();
        while ((line = inputFile.readLine()) != null) {
            xorIntArray.nums = Arrays.stream(line.trim().split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
            System.out.println("Data - " + xorIntArray.nums);
            System.out.println("Length - " + xorIntArray.nums.size());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
            String result = (xorIntArray.bruteForced() <= xorIntArray.optimized())? "bruteforced wins" : "set optimized wins";
            System.out.println(result);
            System.out.println("-------------------------------------------------------------------\n");
        }
    }



}