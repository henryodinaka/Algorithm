package sortAlgorithm;

public class ReverseInteger {
    public static int reverse(int num){
        if (num<0){
            num = num * -1;
    }
        String numToString = Integer.toString(num);

        StringBuilder builder = new StringBuilder();
        int numLen = numToString.length();
        for (int i = numLen - 1; i > -1; i--){
            builder.append(numToString.charAt(i));
        }
        if (num <0) return Integer.valueOf(builder.toString()) * -1;
        else return Integer.valueOf(builder.toString());
    }
    public static void main(String[] args) {
        System.out.println(reverse(1000));
    }
}
