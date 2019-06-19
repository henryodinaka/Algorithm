package sortAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class MadhavArray {

    public static int isMadhavArray(int [] a){

//        List<Integer> sums = new ArrayList<>();

        int loopLength = 2;
        int currentposition;

        for (int i = 0; i < a.length; i++)
        {
            int sum = 0;
            currentposition =0;

            for (int j =i; j<loopLength+1; j++){

                if (j ==0) j =1;
                sum += a[j];
                currentposition++;

            }
            if (a[0] != sum) return 0;

            i += currentposition;

            loopLength += (i + 1);
        }

        return 1;
    }
    public static void main(String[] args) {
        int arr [] = {2,1,1};
        System.out.println(isMadhavArray(arr));
    }
}
