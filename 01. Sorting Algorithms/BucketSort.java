import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public void bucketSort(int[] array, int numberOfBuckets){
        
        var buckets = createBuckets(array, numberOfBuckets);
        var i = 0;
        for(var bucket : buckets){
            Collections.sort(bucket);

            for(var item : bucket){
                array[i++] = item;
            }
        }
    }

    private List<List<Integer>> createBuckets(int[] array, int numberOfBuckets){
        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i < numberOfBuckets; i++){
            buckets.add(new ArrayList<>());
        }

        for(var item: array){
            buckets.get(item / numberOfBuckets).add(item);
        }

        return buckets;
    }
}
