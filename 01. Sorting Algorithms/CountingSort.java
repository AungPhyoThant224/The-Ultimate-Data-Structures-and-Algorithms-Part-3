import java.util.Arrays;

public class CountingSort {

    // ---------------Mosh Solution-----------
    public void countingSort(int[] array, int max){
        int[] newArr = new int[max + 1];
        for(var item : array){
            newArr[item]++;
        }

        var k = 0;
        for(int i = 0; i < newArr.length; i++){
            for(int j = 0; j < newArr[i]; j++){
                array[k++] = i;
            }
        }
    }

    // --------------My Solution-------------
    // public void countingSort(int[] array){
    //     var largest = largestNum(array);
    //     int[] newArr = new int[largest + 1];
    //     for(int i = 0; i < array.length; i++){
    //         newArr[array[i]]++;
    //     }

    //     int i = 0;
    //     int j = 0;
    //     while(j < array.length){
    //         if(newArr[i] != 0){
    //             array[j] = i;
    //             newArr[i]--;
    //             j++;
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    // }

    public int largestNum(int[] array){
        int largest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
}
