import java.util.Comparator;

/**
 * This class is used for the minimum heap and it extends the heap class
 */
public class MinHeap extends Heap
{
    Comparator comparator;

    /**
     * Constructs the min heap
     */
    MinHeap()
    {

    }

    /**
     * Constructs the min heap
     * @param comparator
     */
    MinHeap(Comparator comparator)
    {
        this.comparator = comparator;
    }

    /**
     * compares the two keys
     */
    @Override
    public boolean compare(int key1, int key2)
    {
        return key1 < key2;
    }

    /**
     * adds a key to the heap
     */
    public void addMin(int key)
    {
        add(key);
    }
}
