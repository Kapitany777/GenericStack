package eu.braincluster;

import java.util.ArrayList;

public class GenericStack<T> implements IStack<T>
{
    private final ArrayList<T> items;

    public GenericStack()
    {
        items = new ArrayList<>();
    }

    @Override
    public void push(T item)
    {
        items.add(item);
    }

    @Override
    public T pop()
    {
        if (this.isEmpty())
        {
            throw new EmptyStackException("The stack is empty");
        }

        T item = items.get(items.size() - 1);

        items.remove(items.size() - 1);

        return item;
    }

    @Override
    public T top()
    {
        if (this.isEmpty())
        {
            throw new EmptyStackException("The stack is empty");
        }

        return items.get(items.size() - 1);
    }

    @Override
    public boolean isEmpty()
    {
        return items.isEmpty();
    }

    @Override
    public void clear()
    {
        items.clear();
    }

    @Override
    public int size()
    {
        return items.size();
    }
}
