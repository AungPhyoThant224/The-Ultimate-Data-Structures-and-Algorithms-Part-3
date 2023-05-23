public class Main{
    public static void main(String[] args) {
        
        int[] nums = {2, 3, 5};
        
        // LinearSearch search = new LinearSearch();
        // System.out.println(search.linearSearch(nums, 5));

        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearchRe(nums, 1));
    }
}