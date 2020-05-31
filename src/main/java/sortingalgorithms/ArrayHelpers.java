package sortingalgorithms;

public class ArrayHelpers {

    public void print(int[] arr) {
        for(int i: arr) {
            System.out.println(i);
        }
    }

    public int[] swap(int arr[], int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        return arr;
    }
}
