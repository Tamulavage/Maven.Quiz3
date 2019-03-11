package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for(Character c: word.toCharArray()){
            if(isVowel(c)){
                return true;
            }
        }

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer retVal = null;

        for(int i = 0; i<word.length(); i++){
            if(isVowel(word.charAt(i))){
                return i;
            }
        }

        return retVal;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        Boolean retVal = false;

        String vowels = "AEIOUaeiou";
        for(Character c:vowels.toCharArray()){
            if(c.equals(character)){
                retVal = true;
            }
        }

        return retVal;
    }
}
