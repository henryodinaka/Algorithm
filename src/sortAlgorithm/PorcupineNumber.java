package sortAlgorithm;

public class PorcupineNumber {

    public static int findPorcupineNumber(int n){

        boolean found = false;
        int count = 0;
        int temp = 0;

        while (!found || count !=2){

            boolean isPrime = false;
            n++;


                if (n % 2 !=0) // continue if the number is even

                {
                    double sqrt = Math.sqrt(n);

                    if (sqrt - Math.floor(sqrt) != 0) //continue if it has a perfect square root
                    {
                        for (int j = 2; j < sqrt; j++) {

                            if (n % j == 0) {

                                isPrime = false;

                                break;

                            } else isPrime = true;
                        }

                        if (isPrime && n % 10 == 9) {
                            found = true;
                            count++;

                            if (count ==1)temp = n;
                        }
                        if (found && isPrime && n % 10 != 9)
                        {
                            found =false;
                            temp =0;
                            count =0;
                        }

                    }
                }

        }
        System.out.println("The next porcupine number: "+temp+" and the next prime is "+n);
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(709));
    }
}
