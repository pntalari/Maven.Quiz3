package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        List<Integer> inputList = Arrays.asList(input);
        List<Integer> squaredList = Arrays.asList(squaredValues);
        Boolean flag = false;

        for(int j = 0;j<inputList.size();j++) {
            for (int i = 0; i < squaredList.size(); i++) {
                if (squaredList.get(i) == (Math.pow(inputList.get(i), 2))) {
                    flag = true;
                } else {
                    flag = true;
                }

            }
        }

        return flag;
    }
}
