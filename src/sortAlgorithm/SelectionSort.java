package sortAlgorithm;

public class SelectionSort {

    // function to swap elements at the given index values
    public static void swap(int arr[], int firstIndex, int secondIndex)
    {
        int temp;
        temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    // function to look for smallest element in the given subarray
    public static int indexOfMinimum(int arr[], int startIndex, int n)
    {
        int minValue = arr[startIndex];
        int minIndex = startIndex;

        for(int i = minIndex + 1; i < n; i++) {
            if(arr[i] < minValue)
            {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    public static void selectionSort(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            int miniIndex = indexOfMinimum(arr, i, n);
            swap(arr, i, miniIndex);
        }

    }

    public static void printArray(int arr[], int size)
    {
        int i;
        for(i = 0; i < size; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] agrs)
    {
        int arr[] = {46, 52, 21, 22, 11};
        selectionSort(arr, arr.length);
        System.out.printf("Sorted array: \n");
        printArray(arr, arr.length);

    }
}
