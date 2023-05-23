public class LinearSearch {
    public int linearSearch(int[] arr, int input){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == input){
                return i;
            }
        }
        return -1;
    }
}
