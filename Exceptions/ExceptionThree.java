public class ExceptionThree
{
	public static void main(String args[])
	{
		int num=32;
		if(num==32)
			throw new RuntimeException("num==32");
			//RunTimeException is not a checked Excpetion
	}
}