package eu.braincluster;

public interface IStack<T>
{
    void push(T item);

    T pop();

    T top();

    boolean isEmpty();

    void clear();

    int size();
}
