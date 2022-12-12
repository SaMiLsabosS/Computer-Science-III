
public class Apple implements Root
{
    private int slices;
    public Apple(int s){
        slices = s;
    }
    public int getSlices(){
        return slices;
    }
    public String whatIsTheRoot(){
        return "Tapproots";
    }
    @Override
    public boolean equals(Object f){
        if(this == f)
          return true;
        if(!(f instanceof Apple))
          return false;
        if(((Apple)f).whatIsTheRoot().equals(this.whatIsTheRoot()))
          return true;
        return false;
    }
    public int compareTo(Root f){
        if(this.equals(f))
            return 0;
        else if(f.whatIsTheRoot().compareTo(this.whatIsTheRoot())>0)
            return -1;
        return 1;
    }
    public String toString(){
        return "this apple you're going to eat has "+slices+" slices";
    }
}
