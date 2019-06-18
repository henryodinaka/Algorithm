package sortAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimeCount {

    public static int primeCount(int start, int end){
        int num = start;
        List<Integer> prime  = new ArrayList<>();
        boolean isPrime;
        while (num <=end){

            isPrime = false;

            if (num == 2 || num ==3)isPrime=true;

            double sqrt = Math.sqrt(num);
            System.out.println("Sqrt of "+num+" is "+sqrt);
            if (sqrt > 1){
                for (int i =2 ; i < sqrt; i++){

                    if ((sqrt - Math.floor(sqrt)) ==0) break;

                    if (num % 2 ==0) break;

                    if (i > 1 && num % i == 0) break;
//                    if () break;
                    else isPrime=true;
                }
            }
            if (isPrime) prime.add(num);
            num++;
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
