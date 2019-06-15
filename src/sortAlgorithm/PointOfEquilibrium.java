package sortAlgorithm;

public class PointOfEquilibrium {
   public static int findPoint(int[] arr)
   {
       int forward = 0;
       int reverse = 0;
       int pointA = 0;
       int pointB = 0;
       int moveCount = 1;

       for (int i = 0; i<arr.length; i++){

           if (i == 0) {
               forward += arr[i];
               reverse += arr[(arr.length - 1) - pointB];
               moveCount++;
               continue;
           }

           if (i !=0 && ((arr.length -moveCount) != 1) && (forward ==reverse)) {
               forward += arr[i];
               reverse += arr[(arr.length - 1) - pointB];
               moveCount+=2;
               pointA++;
               pointB++;
               continue;
           }
           if ((arr.length -moveCount) == 1 && (forward ==reverse)){
               return pointA + 1;
           }
           if(i!=0 && forward < reverse){
               pointA++;
               forward += arr[pointA];
               moveCount++;
               continue;
           }
           if (i!=0 && reverse < forward){
               pointB++;
               reverse += arr[(arr.length - 1) - pointB];
               moveCount++;

           }


       }
       return -1;
   }
    static int a6(int[] a)
    {
        if (a.length < 3) return -1;
        int i = 0;
        int j = a.length - 1;
        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];
        for (int k = 1; k < a.length - 2; k++)
        {
            if (leftSum < rightSum)
            {
                i++;
                leftSum += a[i];
                idx = i + 1;
            }
            else
            {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }

    public static void main(String[] args) {

//       int [] ar= {1, 8, 3, 7, 10, 2};
       int [] ar= {1,1,5,3,1,1,1,1,1,1,1};
//        int [] ar= {2, 1, 1, 1, 2, 1, 7};
//       int [] ar= {1, 2, 3};
//       int [] ar= {3, 4, 5, 10};
//       int [] ar= {1, 2, 10, 3, 4};

        System.out.println(findPoint(ar));
    }
}
