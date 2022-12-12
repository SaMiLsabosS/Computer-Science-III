
public class CustomList
{
    private Object data; 
    private CustomList next; 
    public CustomList(Object o){
        data = o;
        next = null;
    }

    public CustomList(Object o, CustomList n){
        data = o;
        next = n;
    }

    public void setData(Object d){
        data = d;
    }

    public void setNext(CustomList n){
        next = n;
    }

    public Object getData(){
        return data;
    }

    public CustomList getNext(){
        return next;
    }

    public void add(Object obj){ // at the end of the CustomList
        CustomList temp = this;
        while(temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(new CustomList(obj));
    }

    public void add(int index, Object obj){ // at a certain point in the CustomList
        CustomList temp = this; 
        int tempIndex = 0;
        if(index == 0){ // head node exception
            CustomList newCustomList = new CustomList(temp.getData(), temp.getNext());
            temp.setData(obj);
            temp.setNext(newCustomList);
        }
        else
            while(temp.getNext() != null){
                if(tempIndex == index-1){
                    CustomList newCustomList = new CustomList(obj, temp.getNext());
                    temp.setNext(newCustomList);
                }
                temp = temp.getNext();
                tempIndex++;
            }   
    }

    public void set(int index, Object obj){
        CustomList temp = this;
        int tempIndex = 0;
        while(temp.getNext() != null){
            if(tempIndex == index)
                temp.setData(obj);                             
            temp = temp.getNext();
            tempIndex++;
        }
    }

    public String get(int index){
        CustomList temp = this;
        int tempIndex = 0;
        while(temp != null){
            if(tempIndex == index)
                return temp.getData().toString();             
            temp = temp.getNext();
            tempIndex++;
        }
        return "Error";
    }

    public void remove(int index){
        int tempIndex = 0;
        CustomList temp = this;
        if(tempIndex == index){ // head node exception
            temp.setData(temp.getNext().getData());
            temp.setNext(temp.getNext().getNext());
        }
        else{
            while(temp.getNext() != null){
                if(tempIndex == index-1)
                    temp.setNext(temp.getNext().getNext());
                temp = temp.getNext();
                tempIndex++;
            }
        }
    }

    public int size(){
        int size = 1;
        CustomList temp = this;
        while(temp.getNext() != null){
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    public String toString(){
        String output = "CustomList = ";
        CustomList temp = this;
        int index = 0;
        while(temp.get(index) != ("Error")){
            output += temp.get(index) + " ";
            index++;
        }
        return output;
    }
}
