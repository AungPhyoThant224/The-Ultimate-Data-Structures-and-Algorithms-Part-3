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

    public int binarySearchIte(int[] arr, int target){
        
        var left = 0;
        var right = arr.length -1;
        while(right >= left){
            var middle = (left + right) / 2;
            if(arr[middle] == target){
                return middle;
            }
            if(arr[middle] > target){
                right = middle -1;
            }
            if(arr[middle] < target){
                left = middle + 1;
            }
        }
        return -1;
    }
}
