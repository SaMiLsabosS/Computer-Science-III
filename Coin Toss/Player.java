
public class Player
{
    private String name;
    private int wins, losses;
    private Wallet wallet;
    public Player(String n, int m, int w, int l){
      name = n;
      wins = w;
      losses = l;
      wallet = new Wallet(m);
    }
    public void setName(String n){
      name = n;
    }
    public void setMoney(int m){
      wallet.setMoney(m);
    }
    public void setWins(int w){
      wins = w;
    }
    public void setLosses(int l){
      losses = l;
    }
    public String getName(){
      return name;
    }
    public int getMoney(){
      return wallet.getMoney();
    }
    public int getWins(){
      return wins;
    }
    public int getLosses(){
      return losses;
    }
    public void removeMoney(int m){
      wallet = getwallet - m; 
    }
    public void addMoney(int m){
      wallet+=m;  
    }
    public String toString(){
      return name+" has "+wins+" wins and "+losses+" losses with "+wallet+" dollars";
    }
}
