package sortAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimeCount {

    public static int primeCount(int start, int end){

        List<Integer> prime  = new ArrayList<>();

        boolean isPrime = false;

        for (int i = start; i < end+1; i++){

            if (i == 2 || i ==3) {
                prime.add(i);
                continue;
            }
            if (i % 2 ==0) continue; // continue if the number is even

            double sqrt = Math.sqrt(i);

            if (sqrt - Math.floor(sqrt) ==0) continue; //continue if it has a perfect square root

            for (int j =2 ; j < sqrt; j++){


                if (i % j == 0){
                    isPrime = false;
                    break;
                }

                else isPrime=true;
            }
            if (isPrime) prime.add(i);
            isPrime = false;
        }
//        prime.forEach(p -> System.out.print(p+" "));
        System.out.print("\nTotal prime numbers between "+start+" and "+end+" is :");
        return prime.size();
    }

    public static void main(String[] args) {

        int i = primeCount(14, 11);
        System.out.println(i);

    }
}
