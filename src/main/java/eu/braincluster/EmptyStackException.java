package eu.braincluster;

public class EmptyStackException extends RuntimeException
{
    public EmptyStackException()
    {
    }

    public EmptyStackException(String message)
    {
        super(message);
    }

    public EmptyStackException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public EmptyStackException(Throwable cause)
    {
        super(cause);
    }
}
