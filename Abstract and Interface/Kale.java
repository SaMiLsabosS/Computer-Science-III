
public class Kale implements Root
{
    private int leafs;
    public Kale(int l){
        leafs = l;
    }
    public int getLeafs(){
        return leafs;
    }
    public String whatIsTheRoot(){
        return "itself";
    }
    @Override
    public boolean equals(Object f){
        if(this == f)
          return true;
        if(!(f instanceof Kale))
          return false;
        if(((Kale)f).whatIsTheRoot().equals(this.whatIsTheRoot()))
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
        return "Kale has "+leafs+" leafs on it";
    }
}
