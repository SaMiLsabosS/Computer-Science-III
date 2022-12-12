public class Number
{
	private int theValue;
	public Number(int value){
        theValue = value;
	}	
	
	public int getValue(){
		return theValue;
	}
	
	@Override
	public boolean equals(Object obj){
	    if(theValue == ((Number) obj).getValue())
	       return true;
		return false;
	} 
	
	@Override
	public int hashCode(){
	    return theValue%10;
	}

	public String toString(){
		return theValue + "";
	}	
}