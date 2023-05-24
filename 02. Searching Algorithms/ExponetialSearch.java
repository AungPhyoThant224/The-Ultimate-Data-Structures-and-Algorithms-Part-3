public class ExponetialSearch{
    public int exponetialSearch(int[] arr, int target){
        var bound = 1;
        while(bound < arr.length && arr[bound] < target){
            bound *= bound;
        }

        var left = bound/2;
        var right = Math.min(bound, arr.length - 1);
        return binarySearchRe(arr, target, left, right);
    }

    private int binarySearchRe(int[] arr, int target, int left, int right){
        if(right < left){
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