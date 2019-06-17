package sortAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimeCount {

    public static int primeCount(int start, int end){
        int num = start;
        List<Integer> prime  = new ArrayList<>();
        boolean isPrime = false;
        while (num <=end){

            double sqrt = Math.sqrt(num);
            System.out.println("Sqrt of "+num+" is "+sqrt);
            if (sqrt > 1){
                for (int i =2 ; i < sqrt; i++){

                    if (num % i == 0) break;
                    else isPrime=true;
                }
            }
            num++;
            if (isPrime) prime.add(num);
        }
        prime.forEach(p -> System.out.print(p+" "));
        System.out.println("Total count ");
        return prime.size();
    }

    public static void main(String[] args) {

        int i = primeCount(2, 30);
        System.out.println(i);

    }
}
