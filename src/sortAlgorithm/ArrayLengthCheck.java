package sortAlgorithm;

public class ArrayLengthCheck {

    public static String[] checkAndReturn (String [] arr, int start, int length){

        if (arr.length < 1  || start < 0) return null;

        int remainder = (arr.length - 1) - start;

        if (length > remainder) return null;

        String [] array = new String[length];

        int j =0;

        for (int i = start; i < arr.length; i++){

            if (j ==length) break;

            array[j] = arr[i];
            j++;
        }
        return array;
    }
    public static void main(String[] args) {
        String [] ar = {"a","b","c","d","4","6","f","y","1","3","9"};
        String[] re = checkAndReturn(ar, -1, 12);
        if (re !=null) {
            for (int i = 0; i < re.length; i++) {
                System.out.print(re[i]+" ");
            }
        }else System.out.println(re);
    }
}
