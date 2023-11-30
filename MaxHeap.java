import java.util.Comparator;

/**
 * This class is used for the maximum heap and it extends the heap class
 */
public class MaxHeap extends Heap
{
    Comparator comparator;

    /**
     * Constructs the max heap
     */
    MaxHeap()
    {

    }

    /**
     * Constructs the max heap
     * @param comparator
     */
    MaxHeap(Comparator comparator)
    {
        this.comparator = comparator;
    }

    /**
     * compares the two keys
     */
    @Override
    public boolean compare(int key1, int key2)
    {
        return key1 > key2;
    }

    /**
     * adds a key to the heap
     */
    public void addMax(int key)
    {
        add(key);
    }
}
