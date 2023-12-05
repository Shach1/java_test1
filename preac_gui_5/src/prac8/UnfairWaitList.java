package prac8;

public class UnfairWaitList<E> extends WaitList<E>
{
    public UnfairWaitList()
    {
        super();
    }
    public void remove(E element)
    {
        content.remove(element);
    }
    public void moveToBack(E element)
    {
        if (contains(element))
        {
            remove(element);
            content.add(element);
        }
    }

}
