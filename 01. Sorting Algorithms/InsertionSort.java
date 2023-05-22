import java.util.Arrays;

public class InsertionSort {
    
    // ----------My Solution-----------------
    // public void insertionSort(int[] nums){
    //     int temIndex = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[temIndex] > nums[i]){
    //             var previousIndex = i - 1;
    //             var currentIndex = i;
    //             while(nums[currentIndex] <= nums[previousIndex] && previousIndex >= 0){
    //                 swap(nums, currentIndex, previousIndex);
    //                 if(previousIndex > 0){
    //                     previousIndex--;
    //                     currentIndex--;
    //                 }
    //             }
    //             temIndex = i;
    //         }
    //         else{
    //             temIndex = i;
    //         }
    //     }
    // }

    // -------------Mosh Solution----------------
    public void insertionSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            var current = nums[i];
            var j = i - 1;

            while(j >= 0 && nums[j] > current){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
    }

    public void swap(int[] nums, int first, int second){
        var temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
