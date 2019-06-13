package sortAlgorithm;

import java.util.*;

public class Base10ToBase2 {
    /*Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.*/

    private static final Scanner scanner = new Scanner(System.in);
    static List<Integer> newBase = new ArrayList<>();

    public static void convert(int num){
        int result = num;

        while (result > 0){

            int module = result % 2;
            newBase.add(module); //Push the remainder to List
            result = result / 2;
        }


    }

    public static int countOnes(int num) {
        convert(num);
        newBase.forEach(System.out ::print);
        List<Integer> list = new ArrayList<>();
        int oneCount = 0;
        for (int i =0; i<newBase.size(); i++){

            if (newBase.get(i) ==1){
                oneCount++;

                if (newBase.size()-1 ==i)
                    list.add(oneCount);
            }
            else {
                list.add(oneCount);
                oneCount = 0;
            }
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
//        scanner.nextLine();
//        int count = 1;

//        while (count <= n){
//            int maxOneCount = countOnes(n);
            System.out.println( "\nMax count of consecutive 1's"+countOnes(n));
            newBase.clear();
//            count++;
//        }
        scanner.close();
    }
}
