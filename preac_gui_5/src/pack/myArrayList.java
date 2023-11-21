package pack;

public class myArrayList
{
    private int _capacity;
    private int _size;
    private final int CAPACITY = 10;
    private Object[] _array;

    myArrayList()
    {
        _size = 0;
        _capacity = CAPACITY;
        _array = new Object[_capacity];
    }

    myArrayList(int capacity)
    {
        _size = 0;
        _capacity = capacity;
        _array = new Object[_capacity];
    }

    private void _addCapacity()
    {
        System.out.println("capacity added!!!");
        _capacity *= 2;
        Object[] tmpArray = new Object[_capacity];
        if(_size > 0)
        {
            System.arraycopy(_array, 0, tmpArray, 0, _size);
        }
        _array = tmpArray;
    }

    public void add (Object obj)
    {
        if(_size >= _capacity)
        {
            _addCapacity();
        }
        _array[_size] = obj;
        _size++;
    }
    public void add (int index, Object obj)
    {
        if(index < 0 || index > _size) return;
        if(index == _size)
        {
            add(obj);
            return;
        }
        if(_size >= _capacity)
        {
            _addCapacity();
        }
        for(int i = _size; i >= index; i--)
        {
            _array[i] = _array[i - 1];
        }
        _array[index] = obj;
        _size++;
    }

    public void print()
    {
        if (_size == 0) return;
        {
            for (int i = 0; i < _size; i++) System.out.print(_array[i] + " ");
        }
        System.out.print("\n");
    }

    public Object get(int index)
    {
        if(index >= _size) return _array[_size - 1];
        if(index < 0) return _array[0];
        return _array[index];
    }

    public void set(int index, Object obj)
    {
        if(index < 0 || index >= _size) return;
        _array[index] = obj;
    }

    public boolean contains(Object obj)
    {
        if (_size > 0)
        {
            for (int i = 0; i < _size; i++)
            {
                if(_array[i].equals(obj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void remove(int index)
    {
        if(index < 0 || index >= _size) return;
        if(index == _size - 1 && _size == 1)
        {
            _size = 0;
            _capacity= CAPACITY;
            _array = new Object[_capacity];
        }
        for(int i = index; i < _size - 1; i++)
        {
            _array[i] = _array[i + 1];
        }
        _array[_size - 1] = null;
        _size--;
    }

    public int size()
    {
        return _size;
    }
    public int capacity()
    {
        return  _capacity;
    }

}
