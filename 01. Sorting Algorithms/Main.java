import java.util.Arrays;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        // int[] nums = {6, 3, 4, 2, 1, 5};
        int[] nums = {7, 3, 1, 4, 6, 2, 3};
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}