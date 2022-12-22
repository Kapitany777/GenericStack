package eu.braincluster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerStackTest
{
    @Test
    void newStackIsEmpty()
    {
        var stack = new GenericStack<Integer>();

        assertTrue(stack.isEmpty());
    }

    @Test
    void newStacksSizeIsZero()
    {
        var stack = new GenericStack<Integer>();

        assertEquals(0, stack.size());
    }

    @Test
    void afterPushOperationStackIsNotEmpty()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);

        assertFalse(stack.isEmpty());
    }

    @Test
    void afterPushOperationStackSizeIsOne()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);

        assertEquals(1, stack.size());
    }

    @Test
    void afterClearOperationStackIsEmpty()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);
        stack.clear();

        assertTrue(stack.isEmpty());
    }

    @Test
    void afterClearOperationStackSizeIsZero()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);
        stack.clear();

        assertEquals(0, stack.size());
    }

    @Test
    void topOperationReturnsTheLastElement()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.top());
    }

    @Test
    void afterTopOperationListSizeIsNotModified()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int item = stack.top();

        assertEquals(3, stack.size());
    }

    @Test
    void popOperationReturnsTheLastElement()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int item = stack.pop();

        assertEquals(30, item);
    }

    @Test
    void afterPopOperationListSizeIsModified()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int item = stack.pop();

        assertEquals(2, stack.size());
    }

    @Test
    void pushOperationTest()
    {
        var stack = new GenericStack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertAll(
                () -> assertFalse(stack.isEmpty()),
                () -> assertEquals(3, stack.size()),
                () -> assertEquals(30, stack.top())
        );
    }

    @Test
    void emptyStackThrowsExceptionOnTopOperation()
    {
        var stack = new GenericStack<Integer>();

        EmptyStackException exception = assertThrows(EmptyStackException.class, stack::top);
        assertEquals("The stack is empty", exception.getMessage());
    }

    @Test
    void emptyStackThrowsExceptionOnPopOperation()
    {
        var stack = new GenericStack<Integer>();

        EmptyStackException exception = assertThrows(EmptyStackException.class, stack::pop);
        assertEquals("The stack is empty", exception.getMessage());
    }
}
