package sortAlgorithm;

public class ReverseInteger {
    public static int reverse(int num){
        boolean isNegative =false;
        if (num<0){
            num = -num;
            isNegative = true;

    }
        String numToString = Integer.toString(num);

        StringBuilder builder = new StringBuilder();
        int numLen = numToString.length();
        for (int i = numLen - 1; i > -1; i--){
            builder.append(numToString.charAt(i));
        }
        if (isNegative) return Integer.valueOf(builder.toString()) * -1;
         else return Integer.valueOf(builder.toString());
    }

    static int a4(int n)
    {
        int sign = 1;
        if (n == 0) return 0;
        if (n < 0)
        {
            sign = -1;
            n = -n;
        }
        int reverse = 0;
        while (n != 0)
        {
            reverse = (reverse * 10) + (n % 10); /**/
            n /= 10;
        }
        return sign * reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-8984567));
        System.out.println(a4(-8984567));
    }
}
