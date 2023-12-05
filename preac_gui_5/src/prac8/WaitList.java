package prac8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Класс для взаимодействия с ConcurrentLinkedQueue, используется дженерики
 * @author Трухманов Евгений
 * @version 1.0
 * @see ConcurrentLinkedQueue
 * @see prac8.IWaitList
 * @param <E> тип элементов, содержащихся в этой очереди
 */
public class WaitList<E> implements IWaitList<E>
{
    /** Поле содержащее очередь */
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Создает WaitList, который изначально пуст.
     */
    public WaitList ()
    {
        content = new ConcurrentLinkedQueue<E>();
    }

    /**
     * Создает WaitList, который изначально хранит в себе коллекцию collection
     * @param collection любой экземпляр класса импользующий интерфейс Collection
     */
    public WaitList (Collection<E> collection)
    {
        content = new ConcurrentLinkedQueue<>(collection);
    }

    /**
     * Добавляет эллемент в очередь
     * @param element тип элементов, содержащихся в этой очереди
     */
    @Override
    public void add(E element)
    {
        content.add(element);
    }

    /**
     * возвращает элемент из начала очереди, удаляя его
     * @return тип элементов, содержащихся в этой очереди
     */
    @Override
    public E remove()
    {
        return content.poll();
    }

    /**
     * Проверяет содержится ли параметр element в этой очереди. Если содержится - возвращает true, иначе false
     * @param element тип элементов, содержащихся в этой очереди
     * @return true/false
     */
    @Override
    public boolean contains(E element)
    {
        return content.contains(element);
    }

    /**
     * Проверяет содержится ли коллекция collection в этой очереди. Если содержится - возвращает true, иначе false
     * @param collection любой экземпляр класса импользующий интерфейс Collection
     * @return true/false
     */
    @Override
    public boolean containsAll(Collection<E> collection)
    {
        return content.containsAll(collection);
    }

    /**
     * Проверяет содержатся ли в этой очереди хотябы один эллемент. Если содержится - возвращает true, иначе false
     * @return true/false
     */
    @Override
    public boolean isEmpty()
    {
        return content.isEmpty();
    }

    /**
     * Приводит экземпляр класса WaitList к строке String
     * @return строка состоящая из элементов массива
     */
    @Override
    public String toString()
    {
        String str = "";
        for(var element:content.toArray())
        {
            str += element + " ";
        }
        return "WaitList: " + str;
    }
}
