import java.util.Arrays;

public class BinarySearch {
    public int binarySearchRe(int[] arr, int trarget){
        // Arrays.sort(arr);
        return binarySearchRe(arr, trarget, 0, arr.length - 1);
    }

    private int binarySearchRe(int[] arr, int target, int left, int right){
        if(right < left){
            System.out.println(left);
            System.out.println(right);
            return -1;
        }

        var middle = (left + right) / 2;
        if(target == arr[middle]){
            return middle;
        }

        if(target < arr[middle]){
            return binarySearchRe(arr, target, 0, middle - 1);
        }

        return binarySearchRe(arr, target, middle + 1, arr.length - 1);
    }

}
