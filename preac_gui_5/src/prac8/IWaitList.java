package prac8;

import java.util.Collection;

public interface IWaitList <E>
{
    public void add( E element);
    public E remove();
    public boolean contains(E element);
    public boolean containsAll(Collection <E> collection);
    public boolean isEmpty();
}
