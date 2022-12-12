
public class DoublyLinkedList
{
    private Object data;
    private DoublyLinkedList prev, next;
    public DoublyLinkedList(Object o){
        data = o;
        next = null;
    }

    public DoublyLinkedList(Object o, DoublyLinkedList p){
        data = o;
        prev = p;
        next = null;
    }

    public DoublyLinkedList(DoublyLinkedList n, Object o){
        data = o;
        prev = null;
        next = n;
    }

    public DoublyLinkedList(Object o, DoublyLinkedList p, DoublyLinkedList n){
        data = o;
        prev = p;
        next = n;
    }

    public void setData(Object d){
        data = d;
    }

    public void setPrev(DoublyLinkedList p){
        prev = p;
    }

    public void setNext(DoublyLinkedList n){
        next = n;
    }

    public Object getData(){
        return data;
    }

    public DoublyLinkedList getPrev(){
        return prev;
    }

    public DoublyLinkedList getNext(){
        return next;
    }

    public void add(Object obj){ // at the end of the DoublyLinkedList
        DoublyLinkedList temp = this;
        while(temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(new DoublyLinkedList(obj));
        temp.getNext().setPrev(temp);
    }

    public void add(int index, Object obj){ // at a certain point in the DoublyLinkedList
        DoublyLinkedList temp = this; 
        int tempIndex = 0;
        if(index == 0){ // head node exception
            DoublyLinkedList newDoublyLinkedList = new DoublyLinkedList(temp.getNext(), temp.getData());
            temp.setData(obj);
            temp.setNext(newDoublyLinkedList);
            newDoublyLinkedList.setPrev(temp);
            newDoublyLinkedList.getNext().setPrev(newDoublyLinkedList);
        }
        else{
            tempIndex = 1;
            while(temp.getNext() != null){
                if(tempIndex == index){
                    DoublyLinkedList newDoublyLinkedList = new DoublyLinkedList(obj, temp, temp.getNext());
                    temp.getNext().setPrev(newDoublyLinkedList);
                    temp.setNext(newDoublyLinkedList);
                }
                temp = temp.getNext();
                tempIndex++;
            }
        }
    }

    public void set(int index, Object obj){
        DoublyLinkedList temp = this;
        int tempIndex = 0;
        while(temp.getNext() != null){
            if(tempIndex == index)
                temp.setData(obj);                             
            temp = temp.getNext();
            tempIndex++;
        }
    }

    public Object get(int index){
        DoublyLinkedList temp = this;
        if(index == 0)
            return data;
        for(int tempIndex = 0; tempIndex < index; tempIndex++)
            temp = temp.getNext();
        return temp.getData();
    }

    public void remove(int index){
        DoublyLinkedList temp = this;
        if(index == 0){ // head node exception
            data = temp.getNext().getData();
            next = temp.getNext().getNext();
        }
        else{
            for(int tempIndex = 0; tempIndex < index-1; tempIndex++)
                temp = temp.getNext();
            temp.setNext(temp.getNext().getNext());
            temp.getNext().setPrev(temp);
        }
    }

    public int size(){
        DoublyLinkedList temp = this;
        int size = 1;
        while(temp.getNext() != null){            
            temp = temp.getNext();
            size++;
        }
        return size;
    }

    public String toString(){
        DoublyLinkedList temp = this;
        String output = "";
        int index = 0;
        while(temp.getNext() != null){
            if(temp.getPrev() == null)
                output += index+" Data = "+temp.getData()+" Prev = "+temp.getPrev()+" Next = "+temp.getNext().getData()+"\n";
            else
                output += index+" Data = "+temp.getData()+" Prev = "+temp.getPrev().getData()+" Next = "+temp.getNext().getData()+"\n";
            index++;
            temp = temp.getNext();
        }
        return output+index+" Data = "+temp.getData()+" Prev = "+temp.getPrev().getData()+" Next = "+temp.getNext()+"\n";
    }
}
