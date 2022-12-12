import java.util.ArrayList;
public class Student
{
    private int month, day;
    private ArrayList<ArrayList<Integer>> monthsAndDays;
    public Student(){
        int months = 12;
        monthsAndDays = new ArrayList<ArrayList<Integer>>(months);
        for(int i = 0; i < months; i++)
           monthsAndDays.add(new ArrayList());        
        for(int month = 0; month<12; month++)
           switch(month){
              case 0: case 2: case 4: case 6: case 7: case 9: case 11: 
              for(int numDays=1;numDays<32;numDays++)
                 monthsAndDays.get(month).add(numDays); 
              break;
              case 3: case 5: case 8: case 10: 
              for(int numDays=1;numDays<31;numDays++)
                 monthsAndDays.get(month).add(numDays); 
              break;
              case 1:  
              for(int numDays=1;numDays<29;numDays++)
                 monthsAndDays.get(month).add(numDays); 
           }         
        month = (int) (Math.random()*12);        
        day = (int) (monthsAndDays.get(month).get((int) (Math.random()*(monthsAndDays.get(month).size()-1))));
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
}
