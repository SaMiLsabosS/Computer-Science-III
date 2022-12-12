import java.util.Scanner;
import java.util.ArrayList;
public class BirthdayParadoxRunner
{
    public static void main(){
        // Create a nested for loop for matching each student with all the other students
        // Add while loop for constant trials
        Scanner k = new Scanner(System.in);
        boolean next = true;
        while(next){
           System.out.print("how many students are in the class? ");
           int students = k.nextInt();
           System.out.print("How many trials do you want to run? ");
           int trials = k.nextInt();
           System.out.print("do you want to see all the matching trials (Y or N)? ");
           String match = k.next();
           if(match.equals("Y"))
              System.out.println(probability(students, trials, true));         
           else
              System.out.println(probability(students, trials, false)); 
           System.out.println("do you want to run another trial (Y or N)? ");
           if(k.next().equals("N"))
             next = false;
        }
    }
    public static String probability(int students, int numTrials, boolean trials){
        String output = "";
        String trialList = "";      
        double numTrialSuccess = 0.0;
        double probability = 1.0;
        int orgNumTrials = numTrials;
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        while(numTrials>0){
           for(int numStudent = 0; numStudent < students; numStudent++){
              listOfStudents.add(new Student());
              for(int compareStudent = 0; compareStudent < numStudent; compareStudent++){
                  int numStudentMonth = listOfStudents.get(numStudent).getMonth();
                  int numStudentDay = listOfStudents.get(numStudent).getDay();
                  if((listOfStudents.get(compareStudent).getMonth() == numStudentMonth) && (listOfStudents.get(compareStudent).getDay() == numStudentDay)){
                     if(trialList.length()>0)
                        trialList+="\n";
                     trialList+="Found match on student "+(numStudent+1)+", month = "+numStudentMonth+", day = "+numStudentDay; 
                     numTrialSuccess++;
                  }
              }
           }
           numTrials--;
           listOfStudents = new ArrayList<Student>();
        }
        for(int i = 1; i < students ; i++)
           probability*=(365.0-i)/365.0;
        probability=(100.0-(probability*100));
        output+="the theoretical probability of a match is: "+String.format("%.02f", probability)+"%\n";
        if(trials)  
           output+=trialList+"\n";
        double reflect = 100 * numTrialSuccess / orgNumTrials;
        output+="using "+students+" students and "+orgNumTrials+" trials, the number where the same birthday was present is: "+(int) (numTrialSuccess)+" which is "+String.format("%.02f",reflect)+"%\n";
        return output;
    }
}
