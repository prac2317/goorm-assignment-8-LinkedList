public class Stack<E> {

    public MyLinkedList<E> myLinkedList = new MyLinkedList<E>();

    public E pop() {
        E data = myLinkedList.get(myLinkedList.getSize()-1);
        myLinkedList.delete(myLinkedList.getSize()-1);
        return data;
    }

    public void push(E data) {
        myLinkedList.add(data);
    }

    public E peek() {
        E data = myLinkedList.get(myLinkedList.getSize()-1);
        return data;
    }

    public boolean isEmpty() {
        if (myLinkedList.getSize() == 0){
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return myLinkedList.getSize();
    }
}
