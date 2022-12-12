import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.*;
public class CharacterLimit
{
    public static void main(){
        Map<String, Integer> sentenceCharCount = new HashMap<>();
        Scanner s = new Scanner(System.in);
        boolean correct = false;
        int characterLimit = 0;
        while(!correct){
            out.println("Character Limit (Range: 69-80): ");
            int charLimit = s.nextInt();
            if(charLimit < 69|| charLimit > 80)
                out.println("Character Limit is not in bounds! Try Again!");     
            else{
                characterLimit = charLimit;
                correct = true;
            }
            out.println();
        }
        try(BufferedReader bR = new BufferedReader(new FileReader("F://CS3//Exceptions//Sentences.txt"))){
            String line = "";
            while((line = bR.readLine()) != null){
                String[] values = line.split("");
                int charCount = 0;
                for(String word : values)
                    charCount += word.length();
                sentenceCharCount.put(line, charCount);
            }
        }
        catch(IOException e){out.println(e.getMessage());}
        try{
            for(String line: sentenceCharCount.keySet()){
                out.print(line+" = ");
                out.print(exceedsCharLimit(line, sentenceCharCount, characterLimit)+"\n");
            }
            //for(String line: sentenceCharCount.keySet())
            //    out.println(line+" = "+sentenceCharCount.get(line));
            //throws new BadInputException("done!");
        }
        catch(BadInputException e){
            out.println(e.getMessage());
        }
    }

    public static boolean exceedsCharLimit(String line, Map<String, Integer> sentences, int limit) throws BadInputException{
        if(sentences.get(line) > limit)
            throw new BadInputException("Sentence exceeds character limit!");
        return true;
    }
}
