package sortAlgorithm;

public class StantonMeasure {

    public static int stantonMeasure(int [] a){

        int onesCount =0;
        int numCount = 0;
        for (int i =0; i<a.length; i++){

            if (a[i] ==1) onesCount++;
        }

        for (int i =0; i<a.length; i++){

            if (a[i] ==onesCount) numCount++;
        }
        return numCount;
    }

    public static void main(String[] args) {
//        int[] arr = {1,4,3,2,1,2,3,2};
        int[] arr = {1,3,1,1,3,3,2,3,3,3,4};
        System.out.println(stantonMeasure(arr));
    }
}
