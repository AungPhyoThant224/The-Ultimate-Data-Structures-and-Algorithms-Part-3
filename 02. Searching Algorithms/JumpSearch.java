public class JumpSearch {

    // ----------------Mosh Solution------------------
    public int jumpSearch(int[] arr, int target){
        var blockSize = (int) Math.sqrt(arr.length);
        var start = 0;
        var next = blockSize;

        while(start < arr.length && arr[next - 1] < target){
            start = next;
            if(next > arr.length){
                next = arr.length;
            }
        }

        for(int i = start; i < next; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
    
    // --------------My Solution--------------------
    // public int jumpSearch(int[] arr, int target){
    //     var blockSize = (int) Math.sqrt(arr.length);
    //     var start = 0;
    //     var next = blockSize;

    //     while(start < arr.length){
    //         if(next >= arr.length){
    //             next = arr.length;
    //         }

    //         var currentLastIndex = next - 1;
    //         if(target == arr[currentLastIndex]){
    //             return currentLastIndex;
    //         }

    //         if(target < arr[currentLastIndex]){
    //             for(int i = start; i < next; i++){
    //                 if(arr[i] == target){
    //                     return i;
    //                 }
    //             }
    //             return -1;
    //         }

    //         start = next;
    //         next += blockSize;
    //     }
    //     return -1;
    // }
}
