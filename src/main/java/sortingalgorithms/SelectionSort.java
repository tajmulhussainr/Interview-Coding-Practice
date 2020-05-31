package sortingalgorithms;
// https://www.youtube.com/watch?v=g-PGLbMth_g
/*pseudo code
    for(int i=0; i<n-1; i++)
        int iMin = i;
        for(int j = i+1; j<length;j++)
            if(a[j] < a[iMin];
                iMin = j;
        if(iMin != i)
            swap(a[i], a[iMin])
 */
public class SelectionSort extends ArrayHelpers {

    public int[] sort(int[] arr) {
        int length = arr.length;
        boolean isSorted;
        for(int i=0; i<length-1; i++) {
            int min = i;
            isSorted = true;
            for (int j=i+1; j<length;j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            if(i != min) {
                swap(arr, i,min);
                isSorted =false;
            }

            if(isSorted) {
                System.out.println("array completed sorting at the end of iteration " + i);
                print(arr);
                break;
            } else {
                System.out.println("partially sorted array at the end of iteration " + i);
                print(arr);
            }


        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 4, 1, 5, 3, 2};
        selectionSort.sort(arr);
        System.out.println("Final output:");
        selectionSort.print(arr);
    }
}
