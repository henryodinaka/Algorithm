package sortAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuthrieSequence {

    public static int isGuthrieSequence(int[] n){
         if (n[n.length-1] !=1) return 0;

         List<Integer> list = new ArrayList<>();

         int temp = n[0];
         int count =0;

         while ( temp >0){

            list.add(temp);

            if (temp ==1) break;
            if (temp % 2 == 0)  temp /= 2 ;
            else temp = (temp * 3) + 1;

            count++;
         }
         int arr[] = new int[list.size()];
        System.out.print("{");
         for (int i=0; i<list.size(); i++){
             arr[i] = list.get(i);
             System.out.print(arr[i]);
             if (list.size() - i > 1) System.out.print(",");
         }
        System.out.println("}");
         if (Arrays.equals(n,arr)) return 1;
         else return 0;

    }
    public static int guthrieIndex(int n){
        int temp = n;
        int count =0;

        while ( temp >0){

            if (temp ==1) break;
            if (temp % 2 == 0)  temp /= 2 ;
            else temp = (temp * 3) + 1;

            count++;
        }
        return count;
    }
    public static void main(String[] args) {
//        int[] arr = {7,17,4,1};
//        int[] arr = { 7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1};
//        System.out.println(isGuthrieSequence(arr));
        System.out.println(guthrieIndex(7));
    }
}
