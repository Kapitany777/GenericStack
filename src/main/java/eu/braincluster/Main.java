package eu.braincluster;

public class Main
{
    public static void main(String[] args)
    {
        var stack = new GenericStack<Integer>();

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.push(10);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.top());

        stack.push(20);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.top());

        Integer item = stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(item);
        System.out.println(stack.top());

        stack.clear();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        try
        {
            System.out.println(stack.top());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            System.out.println(stack.pop());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}