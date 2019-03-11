package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i == indexToCapitalize) {
                sb.append(str.toUpperCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Boolean retVal = false;
        Character baseValue = Character.toLowerCase(baseString.charAt(indexOfString));
        if (baseValue.equals(characterToCheckFor)) {
            retVal = true;
        }
        return retVal;
    }

    public static String[] getAllSubStrings(String string) {


        ArrayList<String> tempHolder = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Integer len = string.length() ;

/*
        for (int i = 0; i < len; i++) {
            for(int j = 1; j<= len; j++){
            tempHolder.add(string.substring(i, j));
            }
        }
        */



        for(int i =0; i<string.length(); i++){
            sb = new StringBuilder();
            for(int j=0; j<=i; j++) {
                sb.append(string.charAt(j));
            }

            tempHolder.add(sb.toString());
        }


        String[] retVal = tempHolder.toArray(new String[tempHolder.size()]);

        return retVal;
    }

    public static Integer getNumberOfSubStrings(String input) {
        return null;
    }
}
