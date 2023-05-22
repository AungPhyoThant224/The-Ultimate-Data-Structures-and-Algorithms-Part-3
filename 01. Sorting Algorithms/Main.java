import java.util.Arrays;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        int[] nums = {8, 2, 4, 1, 3};
        // int[] nums = {7, 3, 1, 4, 6, 2, 5};
        // int[] nums = {15, 6, 3, 1, 22, 10, 13};
        // int[] nums = {7, 3, 1, 5, 2, 7, 7, 2, 1};

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(nums);

        // SelectionSort sort = new SelectionSort();
        // sort.SelectionSort(nums);

        // InsertionSort sort = new InsertionSort();
        // sort.insertionSort(nums);

        // MargeSort sort = new MargeSort();
        // sort.margeSort(nums);

        // QuickSort sort = new QuickSort();
        // sort.quickSort(nums);

        System.out.println(Arrays.toString(nums));

    }
}