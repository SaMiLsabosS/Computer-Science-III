import java.io.*;
import static java.lang.System.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;
public class MapsObjectExtension
{
   private static final int presentYear = 2021, presentDay = 16, presentMonth = 10;
   public static void main(){
      try(BufferedReader read = new BufferedReader(new FileReader("NameBirthdays.txt"))){
         Map<String, Map<String, Integer>> nameBirthday = new TreeMap<>(); 
         Map<String, Integer> birthdayAge = new TreeMap<>();
         Map<Integer, Person> ages = new TreeMap<>();
         String line = "";
         int lines = Integer.parseInt(read.readLine());
         while(lines > 0){
            Person p = new Person(read.readLine());
            int age = presentYear - p.year - 1;
            if(p.getMonthNum() <= presentMonth){
               if(p.getMonthNum() == presentMonth){
                  if(p.day <= presentDay)
                     age++;
               }
               else
                  age++;
            }
            String birthday = p.getMonth()+" "+Integer.toString(p.day)+", "+Integer.toString(p.year)+", ";
            if(!birthdayAge.containsKey(birthday))
               birthdayAge.put(birthday, (int) (Math.random()*Integer.MAX_VALUE));
            birthdayAge.put(birthday, age);
            if(!nameBirthday.containsKey(p.getName()))
               nameBirthday.put(p.getName(), new TreeMap<String, Integer>());
            nameBirthday.put(p.getName(), birthdayAge);
            if(!ages.containsKey(age))
               ages.put(age, new Person());
            ages.put(age, p);
            out.println(ages.get(age).getName().trim()+"'s birthday is "+nameBirthday.get(p.getName())+"and they are "+birthdayAge.get(birthday)+" years old");
            lines--;
         }
      }      
      catch(Exception e){
         out.println(e.getMessage());
      }
   }
}
