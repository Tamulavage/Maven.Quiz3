package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public  class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public  SomeType findOddOccurringValue() {
        Integer len =  array.length;
        SomeType retVal = null;

        for(int k=0; k<len; k++){
            if((getNumberOfOccurrences(array[k]) % 2) == 1 ){
                retVal =  array[k];
            }
        }

        return retVal;
    }

    public SomeType findEvenOccurringValue() {
        Integer len =  array.length;
        SomeType retVal = null;

        for(int k=0; k<len; k++){
            if((getNumberOfOccurrences(array[k]) % 2) == 0 ){
                retVal =  array[k];
            }
        }

        return retVal;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;

        for(int i=0; i< array.length; i++){
            if(array[i].equals(valueToEvaluate)){
                count++;
            }
        }

        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        ArrayList<SomeType> temp = new ArrayList<SomeType>();
        SomeType[] retVal;

        for(SomeType s: array){
            if(predicate.apply(s))
            {
                temp.add(s);
            }
        }

      //  retVal = temp.toArray(retVal[]);

        return null;
    }

}
