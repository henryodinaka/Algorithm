package sortAlgorithm;

public class SumFactor {
    public static int sumFactor(int [] a){
        int sum = 0;
        int sumCount = 0;
        for (int i = 0; i<a.length; i++){
            sum +=a[i];
        }
        for (int i = 0; i<a.length; i++){
            if (sum == a[i]) sumCount++;
        }

        return sumCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,-1,1,-1,1,-1,1};
        System.out.println(sumFactor(arr));
    }
}
