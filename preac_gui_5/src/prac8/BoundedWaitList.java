package prac8;

public class BoundedWaitList<E> extends WaitList<E>
{
    private final int capacity;

    public BoundedWaitList(int capacity)
    {
        super();
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
    }

    @Override
    public void add(E element)
    {
        if (content.size() < capacity)
        {
            super.add(element);
        }
    }

    @Override
    public String toString()
    {
        String str = "";
        for(var element:content.toArray())
        {
            str += element + " ";
        }
        return "BoundedWaitList: " + str;
    }
}
