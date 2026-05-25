// Last updated: 5/25/2026, 11:09:20 AM
import java.util.*;

class Solution {

    PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap =
            new PriorityQueue<>();

    Map<Integer,Integer> delayed = new HashMap<>();

    int k;
    int maxSize = 0;
    int minSize = 0;

    public double[] medianSlidingWindow(int[] nums, int k) {

        this.k = k;

        int n = nums.length;
        double[] result = new double[n-k+1];

        for(int i=0;i<k;i++)
            add(nums[i]);

        result[0] = median();

        for(int i=k;i<n;i++){

            add(nums[i]);
            remove(nums[i-k]);

            result[i-k+1] = median();
        }

        return result;
    }

    void add(int num){

        if(maxHeap.isEmpty() || num <= maxHeap.peek()){
            maxHeap.add(num);
            maxSize++;
        }else{
            minHeap.add(num);
            minSize++;
        }

        balance();
    }

    void remove(int num){

        delayed.put(num, delayed.getOrDefault(num,0)+1);

        if(num <= maxHeap.peek())
            maxSize--;
        else
            minSize--;

        prune(maxHeap);
        prune(minHeap);

        balance();
    }

    void balance(){

        if(maxSize > minSize + 1){
            minHeap.add(maxHeap.poll());
            maxSize--;
            minSize++;
            prune(maxHeap);
        }

        else if(maxSize < minSize){
            maxHeap.add(minHeap.poll());
            minSize--;
            maxSize++;
            prune(minHeap);
        }
    }

    void prune(PriorityQueue<Integer> heap){

        while(!heap.isEmpty()){

            int num = heap.peek();

            if(delayed.containsKey(num)){

                delayed.put(num, delayed.get(num)-1);

                if(delayed.get(num)==0)
                    delayed.remove(num);

                heap.poll();
            }
            else break;
        }
    }

    double median(){

        if(k%2==1)
            return maxHeap.peek();

        return ((long)maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}