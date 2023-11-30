/**
 * @author Kamran Awan
 * This class is used for the heap.
 */
public abstract class Heap
{
    private int[] heap = new int[10];
    private int size;
    public abstract boolean compare(int key1, int key2);

    /**
     * Adds a key into the heap.
     * @param key
     */
    public void add(int key)
    {
        size++;
        if (size >= heap.length)
        {
            int[] temp = new int[size + 1];
            for (int i = 0; i < size; i++)
            {
                temp[i] = heap[i];
            }

            heap = temp;
        }
        heap[size] = key;

        int current = size;

        while (compare(heap[current], heap[current/2]))
        {
            int temp = heap[current];
            heap[current] = heap[current/2];
            heap[current/2] = temp;
            current /= 2;
        }
    }
}