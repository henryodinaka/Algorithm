package sortAlgorithm;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Inertial {
    public static int[] sortArray(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public static int isInertial(int [] a )
    {
        boolean isOddPresent = false,isMaxEven =false,allOdd =true;


        if (a.length < 1) return 0;

        List<Integer> odd  = new ArrayList<>();
        List<Integer> even  = new ArrayList<>();
        Arrays.sort(a);

        if (a[a.length -1] % 2 == 0) isMaxEven = true;

        for (int i = 0; i<a.length; i++)
        {
            if (a[i] % 2 !=0) {
                isOddPresent = true;
                odd.add(a[i]);
            }else {
                even.add(a[i]);
            }

        }
        for (int i =0; i < even.size();i++){

            for (int j =0; j < odd.size(); j++){

                if (even.get(i) < a[a.length - 1] && even.get(i) > odd.get(j)) {
                    allOdd = false;
                    break;
                }
            }
            if (!allOdd) break;
        }
        if (isMaxEven && isOddPresent && allOdd) return 1;
        return 0;
    }
    public static void main(String[] args) {

//        int[] arr = {2,12,12,4,6,8,11};
//        int[] arr = {-2,-4,-6,-8,-11};
//        int[] arr = {2,3,5,7};
        int[] arr = {2,4,6,8,10};
        System.out.println(isInertial(arr) );
    }
}
