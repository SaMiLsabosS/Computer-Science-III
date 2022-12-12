public class Word
{
    private String theValue;
    public Word(String value){
        theValue = value;
    }	

    public String getValue(){
        return theValue;
    }

    @Override
    public boolean equals(Object obj){
        return theValue.equals(((Word) obj).getValue());
    } 

    @Override
    public int hashCode(){
        int numOfVowels = 0;
        String vowels = "aeiou";
        for(int i = 0; i < theValue.length(); i++)
            if(vowels.indexOf(theValue.substring(i,i+1)) > -1)
                numOfVowels++;
        //         for(int i = 0; i < theValue.length(); i++){
        //             if(theValue.substring(i,i+1).equals("a"))
        //                 numOfVowels++;
        //             else if(theValue.substring(i,i+1).equals("e"))
        //                 numOfVowels++;
        //             else if(theValue.substring(i,i+1).equals("i"))
        //                 numOfVowels++;
        //             else if(theValue.substring(i,i+1).equals("o"))
        //                 numOfVowels++;
        //             else if(theValue.substring(i,i+1).equals("u"))
        //                 numOfVowels++;
        //         }
        return (theValue.length() * numOfVowels) % 10;
    }

    public String toString(){
        return theValue;
    }	
}