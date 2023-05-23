import java.util.Arrays;

public class BubbleSort {
    
    // -------------Mosh Solution---------------
    public void bubbleSort(int[] array){
        boolean isSorted;
        for(int i = 0; i < array.length; i++){
            isSorted = true;
            for(int j = 1; j < array.length - i; j++){
                if(array[i] < array[j -1]){
                    swap(array, j, j-1);
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }
    }

    // -------------My Solution------------------
    // public void bubbleSort(int[] array){
    //     for(int i = 0; i < array.length; i++){
    //         for(int j = 0; j < array.length; j++){
    //             if(array[i] < array[j]){
    //                 swap(array, i, j);
    //             }
    //         }
    //     }
    // }

    private void swap(int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
