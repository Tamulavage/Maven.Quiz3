package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {

        for(int i =0; i<input.length; i++){
            input[i] = input[i]*input[i];
        }

        List<Integer> input1 = Arrays.asList(input);
        List<Integer> squaredValuesinput = Arrays.asList(squaredValues);

        Collections.sort(input1);
        Collections.sort(squaredValuesinput);

        input = input1.toArray(new Integer[input1.size()]);
        squaredValues = squaredValuesinput.toArray(new Integer[squaredValuesinput.size()]);


        return Arrays.equals(input, squaredValues);
    }
}
