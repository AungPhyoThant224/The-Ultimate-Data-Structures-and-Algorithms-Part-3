import java.util.Arrays;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        // int[] nums = {8, 2, 4, 1, 3};
        int[] nums = {7, 3, 1, 4, 6, 2, 3};

        // BubbleSort sort = new BubbleSort();
        // sort.bubbleSort(nums);

        SelectionSort sort = new SelectionSort();
        sort.SelectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}