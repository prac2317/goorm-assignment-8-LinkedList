public class Queue<E> {

    public MyLinkedList<E> myLinkedList = new MyLinkedList<E>();

    public E dequeue() {
        E data = myLinkedList.get(0);
        myLinkedList.delete(0);
        return data;
    }

    public void enqueue(E data) {
        myLinkedList.add(data);
    }

    public E peek(){
        E data = myLinkedList.get(0);
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
