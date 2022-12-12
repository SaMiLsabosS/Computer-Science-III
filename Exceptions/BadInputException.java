
public class BadInputException extends Exception
{
    public BadInputException(String message){
        super(message);
    }
}
// checked exception is Exception (needs try and catch loop, and no throws exception)
// unchecked exception is RuntimeException (means no try catch loop)