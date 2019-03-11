package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String strRet = "";
        Integer index = VowelUtils.getIndexOfFirstVowel(str);
        if(index!=null) {
            if (VowelUtils.startsWithVowel(str)) {
                strRet = str + "way";
            } else {
                strRet = str.substring(index) + str.substring(0, index) + "ay";
            }
        }
        else {
            strRet = str + "ay";
        }
        return strRet;
    }
}
