public class TernarySearch {
    public int ternarySearch(int[] arr, int target){
        return ternarySearch(arr, target, 0, arr.length - 1);
    }

    private int ternarySearch(int[] arr, int target, int left, int right){
        var partitionSize = (right - left) / 3;
        var mid1 = left + partitionSize;
        var mid2 = right - partitionSize;

        if(mid1 > mid2){
            return -1;
        }

        if(target == arr[mid1]){
            return mid1;
        }

        if(target == arr[mid2]){
            return mid2;
        }

        if(target < arr[mid1]){
            return ternarySearch(arr, target, left, mid1 - 1);
        }

        if(target > arr[mid1] && target < arr[mid2]){
            return ternarySearch(arr, target, mid1 + 1, mid2 - 1);
        }

        return ternarySearch(arr, target, mid2 + 1, right);

    }
}
