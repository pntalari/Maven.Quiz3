package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String temp = "";
        String[] arr = str.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            temp = str + arr[i].substring(i,i+1).toUpperCase() + arr[i].substring(i+1);
        }
        return null;
    }
}
