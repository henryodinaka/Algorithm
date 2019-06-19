package sortAlgorithm;

public class Upcount {

    public static int nUpCount (int [] arr, int n){

        int count = 0;

        boolean isUp = false;
        int partialSum =0;

        for (int i =0; i< arr.length; i++){
            partialSum = partialSum + arr[i];

            if (!isUp && partialSum > n){
                count++;
                isUp = true;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1,5,3,2,-3};
        System.out.println(nUpCount(arr, 20));
    }
}
