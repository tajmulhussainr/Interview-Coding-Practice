package sortingalgorithms;
//https://mkyong.com/java/java-bubble-sort-example/
public class BubbleSort extends PrintArray {

    public int[] sort(int[] arr) {
        int length = arr.length;
        int temp;
        boolean is_sorted;

        for(int i=0; i<length; i++) {
            is_sorted = true;
            for(int j=1; j<length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    is_sorted = false;
                }
            }
            if (is_sorted) {
                System.out.println("array is sorted at iteration " + i);
                break;
            } else {
                System.out.println("array at the end of iteration " + i);
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
