import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        var boundary = partition(arr, start, end);
        
        quickSort(arr, start , boundary - 1);
        quickSort(arr, boundary + 1 , end);
    }

    private int partition(int[] arr, int start, int end){
        var pivot = arr[end];
        var b = start - 1;
        for(int i = start; i <= end; i++){
            if(arr[i] <= pivot && i != 0){
                swap(i, ++b, arr);
            }
        }
        return b;
    }

    private void swap(int first, int second, int[] arr){
        var temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
