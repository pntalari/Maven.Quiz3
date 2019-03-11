package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] arr = str.split(" ");
        String strRet = "";
        String finalStr = "";

        for (int i =0;i<arr.length;i++) {
            Integer index = VowelUtils.getIndexOfFirstVowel(arr[i]);
            if (index != null) {
                if (VowelUtils.startsWithVowel(arr[i])) {
                    strRet += arr[i] + "way";

                } else {
                    strRet += arr[i].substring(index) + arr[i].substring(0, index) + "ay";

                }
            } else {
                strRet += arr[i] + "ay";

            }

        }
        return strRet;
    }
}
