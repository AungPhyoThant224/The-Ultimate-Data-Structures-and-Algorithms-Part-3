public class Main{
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // LinearSearch search = new LinearSearch();
        // System.out.println(search.linearSearch(nums, 5));

        // BinarySearch search = new BinarySearch();
        // System.out.println(search.binarySearchRe(nums, 1));
        // System.out.println(search.binarySearchIte(nums, 5));

        // TernarySearch search = new TernarySearch();
        // System.out.println(search.ternarySearch(nums, 5));

        // JumpSearch search = new JumpSearch();
        // System.out.println(search.jumpSearch(nums, 9));

        TernarySearch search = new TernarySearch();
        System.out.println(search.ternarySearch(nums, 4));
    }
}