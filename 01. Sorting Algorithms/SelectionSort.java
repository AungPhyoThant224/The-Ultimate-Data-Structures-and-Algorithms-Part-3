public class SelectionSort {
    public void SelectionSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int tempIndex = i;
            for(int j = i; j < nums.length; j++){
                if(nums[tempIndex] > nums[j]){
                    tempIndex = j;
                }
            }
            swap(nums, i, tempIndex);
        }
    }

    public void swap(int[] nums, int first, int second){
        var temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}