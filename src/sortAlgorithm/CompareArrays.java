package sortAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArrays {

    public static int[] compare(int [] first, int [] sec)
    {
        final int [] empty = {};

        int smaller =0;
        int larger =0;
        boolean firstIsSmaller =false;
        List<Integer> foundItem = new ArrayList<>();


        if (first ==null|| sec ==null) return null;
        if (first.length < 1 || sec.length < 1) return empty;

        if (first.length < sec.length)  {
            smaller = first.length;
            larger = sec.length;
            firstIsSmaller = true;
        }else {
            smaller = sec.length;
            larger = first.length;

        }

        for (int i = 0 ; i < smaller ; i++){

            for (int j = 0; j<larger; j++){
                if (firstIsSmaller){

                    if (first[i]==sec[j]){
                        foundItem.add(first[i]);
                    }
                }else {
                    if (sec[i] == first[j]){
                        foundItem.add(sec[i]);
                    }
                }
            }
        }
        if (foundItem.size() < 1) return empty;
        else
        {
            int[] intercept = new int[foundItem.size()];
            for (int i = 0; i<foundItem.size(); i++){
                intercept[i] = foundItem.get(i);
            }
            return intercept;
        }
    }

    public static void main(String[] args) {

        int[] first = {1, 8, 3, 2};
        int[] sec =  {4, 2, 6, 1};
        int[] compare = compare(first, sec);
        if (compare != null) {
            System.out.print("{ ");
            for (int i = 0; i < compare.length; i++) {
                System.out.print(compare[i] + " ");
            }
            System.out.println("}");
        }else System.out.println(compare);
    }
}
