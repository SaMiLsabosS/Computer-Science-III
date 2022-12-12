import static java.lang.System.*;
public class Runner
{
    public static void main(){
        DoublyLinkedList listy = new DoublyLinkedList("apple");
        listy.add("banana");
        listy.add("coconut");
        listy.add("dragonFruit");
        out.println("size = " + listy.size() + "\n" + listy);

        out.println("\nadding eggplant at position 0");
        listy.add(0,"eggplant");
        out.println("size = " + listy.size() + "\n" + listy);

        out.println("\nadding fruit at position 1");
        listy.add(1,"fruit");
        out.println("size = " + listy.size() + "\n" + listy);

        out.println("\nadding grapefruit at position 3");
        listy.add(3,"grapefruit");
        out.println("size = "  + listy.size() + "\n" + listy);

        out.println("\nsetting position 0 to lettuce");
        listy.set(0,"lettuce");
        out.println("size = "  + listy.size() + "\n" + listy);

        out.println("\nsetting position 1 to tomato");
        listy.set(1,"tomato");
        out.println("size = "  + listy.size() + "\n" + listy);

        out.println("\nsetting position 2 to kiwi");
        listy.set(2,"kiwi");
        out.println("size = "  + listy.size() + "\n" + listy);

        out.println("\ngetting position 5");
        out.println("position 5 = "  + listy.get(5));

        out.println("\ngetting position 1");
        out.println("position 1 = "  + listy.get(1));

        out.println("\nremoving position 0");
        listy.remove(0);
        out.println("size = "  + listy.size() + "\n" + listy);

        out.println("\nremoving position 1");
        listy.remove(1);
        out.println("size = "  + listy.size() + "\n" + listy);

        out.println("\nremoving position 3");
        listy.remove(3);
        out.println("size = "  + listy.size() + "\n" + listy);
    }
}
