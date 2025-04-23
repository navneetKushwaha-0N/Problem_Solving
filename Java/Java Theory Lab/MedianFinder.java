import java.util.PriorityQueue;
import java.util.Collections;

class MedianFinder {
    private PriorityQueue<Integer> maxHeap; 
    private PriorityQueue<Integer> minHeap; 

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder()); 
        minHeap = new PriorityQueue<>(); 
    }

    public void addNum(int num) {
       
        maxHeap.add(num);

        
        minHeap.add(maxHeap.poll());

        
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
       
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println("Median: " + medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println("Median: " + medianFinder.findMedian()); 
    }
}