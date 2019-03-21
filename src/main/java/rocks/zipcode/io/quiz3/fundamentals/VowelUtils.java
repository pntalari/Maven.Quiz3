package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    private static final Character[] VOWELS = {'A','E','I','O','U',
                                            'a','e','i','o','u'};

    public static Boolean hasVowels(String word) {
        //Nhu
        for (int i = 0; i <VOWELS.length ; i++) {
            if(word.contains(VOWELS[i].toString())){
                return true;
            }
        }

        //mine
        Boolean flag = false;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i)))
            {
                flag = true;
            } else
                flag = false;

        }
        return flag;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer index = 0;

        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i)))
            {
                index = i;
                break;
            } else
                index = null;
        }

        return index;
    }


    public static Boolean startsWithVowel(String word) {
        return (getIndexOfFirstVowel(word) == word.indexOf(word.charAt(0)));
    }

    public static Boolean isVowel(Character character) {

        for (int i = 0; i <VOWELS.length ; i++) {
            if(character.equals(VOWELS[i])){
                return true;
            }
        }

        Boolean flag = false;
        if ((Character.toLowerCase(character) == 'a') ||
                (Character.toLowerCase(character) == 'e') ||
                (Character.toLowerCase(character) == 'i') ||
                (Character.toLowerCase(character) == 'o') ||
                (Character.toLowerCase(character) == 'u')) {
            flag = true;
        } else
            flag = false;

        return flag;
    }
}
