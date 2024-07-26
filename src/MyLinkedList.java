import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> last;
    private int size;

    public int getSize() {
        return size;
    }

    public MyLinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public Node<T> getIndexNode(int index){
        Node<T> target = head;
        for (int i = 0; i < index; i++) {
            target = target.getNext();
        }
        return target;
    }

    public T get(int index) {
        if (index > size-1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return getIndexNode(index).getData();
    }

    public void delete(int index) {
        if (index > size-1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        // index가 0일 경우, 마지막일 경우, 0과 마지막 사이에 있을 경우 3가지로 구분
        if (index == size-1) {
            getIndexNode(index).setNext(null);
        } else if (index == 0){
            head = getIndexNode(1);
        } else {
            getIndexNode(index-1).setNext(getIndexNode(index+1));
        }

        size--;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

