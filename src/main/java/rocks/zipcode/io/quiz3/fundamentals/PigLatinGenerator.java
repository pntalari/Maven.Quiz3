package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] arr = str.split(" ");
        StringBuilder builder = new StringBuilder();
//        String strRet = "";

        for (int i = 0; i < arr.length - 1; i++) {
            String word = arr[i];
            if (VowelUtils.startsWithVowel(word)) {
                builder.append(word + "way" + " ");
            } else {
                Integer index = VowelUtils.getIndexOfFirstVowel(arr[i]);
                if (index == null) {
                    builder.append(word + "ay" + " ");
                } else {
                    String beginning = word.substring(0, index);
                    String ending = word.substring(index);
                    String finalWord = ending + beginning + "ay";

                    builder.append(finalWord + " ");
                }
            }
        }

            builder.deleteCharAt(builder.length());
            return builder.toString();
        }

//            Integer index = VowelUtils.getIndexOfFirstVowel(arr[i]);
//            if (index != null) {
//                if (VowelUtils.startsWithVowel(arr[i])) {
//                    strRet += arr[i] + "way";
//
//                } else {
//                    strRet += arr[i].substring(index) + arr[i].substring(0, index) + "ay";
//
//                }
//            } else {
//                strRet += arr[i] + "ay";
//
//            }

            //    }
            //   return strRet;

}
