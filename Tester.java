public class Tester
{
    public static void main(String[] args)
    {
        MinHeap minHeap = new MinHeap();
        minHeap.addMin(2);
        minHeap.addMin(1);
        minHeap.addMin(3);
        minHeap.addMin(4);
        minHeap.addMin(6);
        minHeap.addMin(5);
        minHeap.addMin(7);
        minHeap.addMin(9);
        minHeap.addMin(11);
        minHeap.addMin(10);
        
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.addMax(3);
        maxHeap.addMax(2);
        maxHeap.addMax(4);
    }
}
