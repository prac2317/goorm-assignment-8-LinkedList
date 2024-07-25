import java.util.List;

public class Queue<E> {

    public MyLinkedList<E> myLinkedList = new MyLinkedList<E>();
    private int count;

    public E poll() {
        E data = myLinkedList.get(1);
        myLinkedList.delete(1);
        return data;
    }

    public void add(E data) {
        myLinkedList.add(data);
    }


}
