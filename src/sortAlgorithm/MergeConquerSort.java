package sortAlgorithm;

/**
 * This merge sort is best used in searching Linked list. This is because it requires additional space as the original array
 */
public class MergeConquerSort {
    /*  
    a[] is the array, p is starting index, that is 0, 
    and r is the last index of array. 
*/

// lets take a[5] = {32, 45, 67, 2, 7} as the array to be sorted.

//    static int calls =1;
//    static int isIf =1;
    // merge sort function
    public static void mergeSort(int array[], int minIndex, int lastIndex)
    {

//        System.out.println("Entering calls "+calls);
//        System.out.println("> minIndex :"+minIndex);
//        System.out.println("> lastIndex :"+lastIndex);
//        calls++;
        int middleIndex;
//        System.out.println("Is minIndex less than lastIndex : "+(minIndex<lastIndex ? "Yes":"No"));
        if(minIndex < lastIndex)
        {
//            System.out.println("If statement :"+isIf);
//            isIf++;
            middleIndex = (minIndex + lastIndex) / 2;
//            System.out.println("<><><><><> middleIndex :"+middleIndex);
            mergeSort(array, minIndex, middleIndex);
//            System.out.println(">> minIndex :"+minIndex);
//            System.out.println(">> lastIndex :"+lastIndex);
            mergeSort(array, middleIndex+1, lastIndex);
//            System.out.println(">>> minIndex :"+minIndex);
//            System.out.println(">>> lastIndex :"+lastIndex);
            merge(array, minIndex, middleIndex, lastIndex);
//            System.out.println(">>>> minIndex :"+minIndex);
//            System.out.println(">>>> lastIndex :"+lastIndex);
        }
    }

    // function to merge the subarrays
    static void merge(int array[], int minIndex, int middleIndex, int lastIndex)
    {
        int arrayProcessed[] = new int[array.length];   //same size of array[]
        int firstIndex, j, k;
        k = 0;
        firstIndex = minIndex;
        j = middleIndex + 1;
        while(firstIndex <= middleIndex && j <= lastIndex)
        {
            if(array[firstIndex] < array[j])
            {
                arrayProcessed[k++] = array[firstIndex++];    // same as arrayProcessed[k]=array[firstIndex]; k++; firstIndex++;
            }
            else
            {
                arrayProcessed[k++] = array[j++];
            }
        }

        while(firstIndex <= middleIndex)
        {
            arrayProcessed[k++] = array[firstIndex++];
        }

        while(j <= lastIndex)
        {
            arrayProcessed[k++] = array[j++];
        }

        for(firstIndex=lastIndex; firstIndex >= minIndex; firstIndex--)
        {
            array[firstIndex] = arrayProcessed[--k];  // copying back the sorted list to array[]
        }
    }

    // function to print the array
    static void printArray(int a[], int size)
    {
        int i;
        for (i=0; i < size; i++)
        {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }

    public static void main(String[] args)
    {
        int arr[] = {32, 45, 67, 2, 7,47,894,5,4,76,56,65,64,34,23,23,55,77,78,98,50,9,3,1,90,94,23,32,48};
//        int len = sizeof(arr)/sizeof(arr[0]); // This is how to find the size of array in C programming language
        int len = arr.length;

        System.out.printf("Given array: \n");
        printArray(arr, len);

        // calling merge sort
        mergeSort(arr, 0, len - 1);

        System.out.printf("\nSorted array: \n");
        printArray(arr, len);
    }
}
