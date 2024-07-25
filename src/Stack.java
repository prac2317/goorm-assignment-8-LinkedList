public class Stack<E> {

    public MyLinkedList<E> myLinkedList = new MyLinkedList<E>();
    private int count;

    public E pop() {
        E data = myLinkedList.get(count);
        myLinkedList.delete(count);
        count--;
        return data;
    }

    public void push(E data) {
        myLinkedList.add(data);
        count++;
    }
}
