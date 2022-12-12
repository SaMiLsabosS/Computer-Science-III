public class ExceptionTwo
{
   public static void main(String args[]) throws Exception
   {
        int num=32;
        if(num==32)
            throw new Exception("num==32");
            // throw new RunTimeException("num==32");
        //Exception is a checked Exception
    }
}