import java.util.Arrays;

public class MargeSort {
    public void margeSort(int[] array){
        if(array.length < 2){
            return;
        }
        var middle = array.length / 2;

        var left = new int[middle];
        for(int i = 0; i < middle; i++){
            left[i] = array[i];
        }
        
        var right = new int[array.length - middle];
        for(int i = middle; i < array.length; i++){
            right[i - middle] = array[i];
        }
        margeSort(left);
        margeSort(right);

        marge(left, right, array);
    }

    private void marge(int[] left, int[] right, int[] result){
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k++] = left[i++];
            }
            else{
                result[k++] = right[j++];
            }
        }

        while(i < left.length){
            result[k++] = left[i++];
        }

        while(j < right.length){
            result[k++] = right[j++];
        }
    }
}
