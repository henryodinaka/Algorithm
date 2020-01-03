package sortAlgorithm;

public class PerfectSquarePair {
    public static int countSquarePairs(int [] a){

        int pairCount = 0;
        for (int i =0; i<a.length; i++){
            for (int j = i+1; j<a.length; j++){
                 int sum =0;
                 if (a[i] <=0 || a[j]<=0) continue;
                 sum = a[i] + a[j];

                 double sqrt = Math.sqrt(sum);
                 if ((sqrt - Math.floor(sqrt) ==0)){
                     pairCount++;
                     System.out.println("The pairs: "+a[i] + " and "+a[j]);
                 }
            }
        }
        return pairCount;
    }
    public static void main(String[] args) {

//        int[] arr = {11,5,4,20};
//        int[] arr = {9,0,2,-5,7};
        int[] arr = {9};
        System.out.println(countSquarePairs(arr));
    }
}
