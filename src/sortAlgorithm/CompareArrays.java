package sortAlgorithm;

import java.util.Arrays;
import java.util.List;

public class CompareArrays {

    public static int[] compare(int [] first, int [] sec)
    {
        final int [] empty = {};

        int smaller =0;
        int larger =0;
        /* List<T> smaller =null;
        List<T> larger =null;

        if (first.length < sec.length)  {
            smaller = Arrays.asList(first);
            larger = Arrays.asList(sec);
        }else {
            smaller = Arrays.asList(sec);
            larger = Arrays.asList(first);
        }*/

        if (first.length < 1 || sec.length < 1) return empty;

        if (first ==null|| sec ==null) return null;

        if (first.length < sec.length)  {
//            smaller = Arrays.asList(first);
            larger = sec.length;
        }else {
            smaller = sec.length;
            larger = first.length;
        }

        for (int i = 0 ; i < smaller ; i++){

            for (int j = 0; j<larger; j++){
//                if ()
            }
        }
        return null;
    }

    public static <T>List<T> compareArrToList(T [] sec)
    {
            return Arrays.asList(sec);

    }
    public static void main(String[] args) {

    }
}
