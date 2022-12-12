
public class Person
{
    private String name, month;
    private final String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
    int day, year; 
    private boolean leap;
    public Person(){
        name = "";
        month = "";
        year = (int) (Math.random()*3)+2003;
        day = (int) (Math.random()*31);
    }
    public Person(String n){
        name = n;
        month = months[(int) (Math.random()*12)];
        
        year = (int) (Math.random()*3)+2003;
        if(year == 2004)
          leap = true;
        
        switch(month){
          case "January": case "March": case "May": case "July": case "August": case "October": case "December": 
          day = (int) (Math.random()*31);
          break;
          case "April": case "June": case "September": case "November":
          day = (int) (Math.random()*30);
          case "Febuary":if(leap){day = (int) (Math.random()*29);}
          else{day = (int) (Math.random()*28);}
        }
    }
    public String getName(){
       return name;
    }
    public String getMonth(){
       return month;
    }
    public int getMonthNum(){
       switch(month){
          case "January": return 0;
          case "Fenuary": return 1;
          case "March" : return 2;
          case "April" : return 3;
          case "May": return 4;
          case "June": return 5;
          case "July": return 6;
          case "August": return 7;
          case "September": return 8;
          case "October": return 9;
          case "November": return 10;
       }
       return 11;
    }
}
