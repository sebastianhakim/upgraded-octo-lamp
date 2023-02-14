import java.util.Arrays;
import java.util.Random;

public class Sort {

    public static int[] createRandomArray(int arrayLength) {
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
        array[i] = random.nextInt(100);
        }
        
        return array;
        }

        public static void bubbleSort(int[] array) {
            int n = array.length;
                for (int i = 0; i < n-1; i++)
                    for (int j = 0; j < n-i-1; j++)
                        if (array[j] > array[j+1])
                        {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
               
        public static boolean isSorted (int[] array) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    return false;
            }

        }

        return true;

    }



        public static int[] mergeArray(int[] a, int[] b) {
            int[] c = new int[a.length + b.length];
            int i = 0, j = 0, k = 0;

            while (i < a.length && j < b.length) {
                if (a[i] <= b[j]) {
                     c[k] = a[i];
                    k++;
                    i++;
                } else {
                    c[k] = b[j];
                    k++;
                    j++;
                }
            }

            while (i < a.length) {
                c[k] = a[i];
                k++;
                i++;
            }

            while (j < b.length) {
                c[k] = b[j];
                k++;
                j++;
            }

            return c;

                    }

                    


    public static void mergeArray(int[] a, int start, int middle, int end) {
        int[] tempArray = new int[end - start];
        int i = start, j = middle, k = 0;
        while (i < middle && j < end) {
            if (a[i] <= a[j]) {
                tempArray[k] = a[i];
                k++;
                i++;
            } else {
                tempArray[k] = a[j];
                k++;
                j++;
            }
        }

        while (i < middle) {
        tempArray[k] = a[i];
            k++;
            i++;
        }

        while (j < end) {
                tempArray[k] = a[j];
                k++;
                j++;
        }

        for (i = start; i < end; i++) {
                a[i] = tempArray[i - start];
        }



}

    public static void mergeSort(int[] a, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        
        int middle = (start + end) / 2;
        mergeSort(a, start, middle);
        mergeSort(a, middle, end);
        mergeArray(a, start, middle, end);

    }

    public static void mergeSort(int[] a) {
        mergeSort(a, 0, a.length);

    }



















    public static void main(String[] args) throws Exception {
        int arrayLength = 100_000;
        int[] array = createRandomArray(arrayLength);
        long startTime;
        float time_Spent;
        startTime = System.currentTimeMillis() / 1000;

        bubbleSort(array);
        time_Spent = System.currentTimeMillis() / 1000 - startTime;
        System.out.println("Bubble sort time: " + time_Spent + " s");
        // System.out.println(Arrays.toString(array));
        startTime = System.currentTimeMillis() / 1000;
        mergeSort(array);
        time_Spent = System.currentTimeMillis() / 1000 - startTime;
        System.out.println("MergeSort time: " + time_Spent + " s");
        System.out.println("After sorting, is the array sorted? " + isSorted(array));

       

    }
}
