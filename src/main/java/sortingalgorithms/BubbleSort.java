package sortingalgorithms;
//https://mkyong.com/java/java-bubble-sort-example/
// https://www.youtube.com/watch?v=xli_FI7CuzA
/* pseudo code
    for(int i=0; i<n; i++)
        for(int j=1; j<n-1; j++)
            if(a[j-1] > arr[j]
                swap(a[j-1], a[j])
 */
public class BubbleSort extends ArrayHelpers {

    public int[] sort(int[] arr) {
        int length = arr.length;
        int temp;
        boolean is_sorted;

        for(int i=0; i<length; i++) {
            is_sorted = true;
            for(int j=1; j<length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    swap(arr,j-1, j);
                    is_sorted = false;
                }
            }
            if (is_sorted) {
                System.out.println("array completed sorting at the end of iteration " + i);
                break;
            } else {
                System.out.println("partially sorted array at the end of iteration " + i);
                print(arr);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5, 4, 1, 5, 3, 2};
        bubbleSort.sort(arr);
        System.out.println("Final output:");
        bubbleSort.print(arr);
    }
}
