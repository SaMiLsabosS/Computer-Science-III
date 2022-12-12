import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.*;
public class WordsMinimum
{
    public static void main(){
        Map<String, Integer> paragraphWordCount = new HashMap<>();
        Scanner s = new Scanner(System.in);
        boolean correct = false;
        int wordMinimum = 0;
        while(!correct){
            out.println("Word Minimum (Range: 45-90): ");
            int input = s.nextInt();
            if(input < 45|| input > 90)
                out.println("Word Limit is not in bounds! Try Again!");     
            else{
                wordMinimum = input;
                correct = true;
            }
            out.println();
        }
        try(BufferedReader bR = new BufferedReader(new FileReader("E://CS3//Exceptions//Paragraphs.txt"))){
            String line = "";
            String paragraph = "";
            int wordCount = 0;
            while((line = bR.readLine()) != null){
                if(!line.equals("")){
                    String[] values = line.split(" ");
                    for(String word : values){
                        if(word.contains("-")){
                            String[] words = word.split("-");
                            for(String indiv : words)
                                wordCount++;
                        }
                        else
                            wordCount++;
                    }
                    paragraph += line+"\n";
                }
                else{
                    paragraphWordCount.put(paragraph, wordCount);
                    paragraph = "";
                    wordCount = 0;
                }
            }
        }
        catch(IOException e){out.println(e.getMessage());}
        try{
            for(String paragraph: paragraphWordCount.keySet()){
                out.println(paragraph);
                out.print("= "+aboveWordMinimum(paragraph, paragraphWordCount, wordMinimum)+"\n\n");
            }
        }
        catch(BadInputException e){out.println(e.getMessage());}
    }

    public static boolean aboveWordMinimum(String paragraph, Map<String, Integer> paragraphs, int minimum) throws BadInputException{
        if(paragraphs.get(paragraph) < minimum)
            throw new BadInputException("Paragraph is below the word minimum!");
        return true;
    }
}
