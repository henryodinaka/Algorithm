package sortAlgorithm;

public class NextPerfectSquare {

    public static int isPerfectSqaure(int n){

        while ( n >0 ){

        double sqrt = Math.sqrt(n);

        if ((sqrt - Math.floor(sqrt) == 0)) return n;

            n++;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSqaure(12));
    }
}
