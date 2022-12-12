public class Position implements Comparable<String>
{
    int x;
    int y;
    public Position(int xPos, int yPos){
        x = xPos;
        y = yPos;
    }
    
    @Override
    public int compareTo(String path){
        if(path.contains(this.toString()))
            return 1;
        return 0;
    }
    
    public String toString(){
        return "("+Integer.toString(x)+","+Integer.toString(y)+")";
    }
}
