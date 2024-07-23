public class MyLinkedList<T> {

    private Node<T> start;
    private Node<T> last;
    private int length;

    public MyLinkedList() {
        this.start = null;
        this.last = null;
        this.length = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (start == null) {
            start = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        length++;
    }

    public T get(int index) {
        if (index > length || index < 1) {
            System.out.println("해당 index가 존재하지 않습니다.");
            return null;
        }
        return getIndexNode(index).getData();
    }

    public void delete(int index) {
        if (index > length || index < 1) {
            System.out.println("해당 index가 존재하지 않습니다.");
            return;
        }

        // index가 1일 경우, 마지막일 경우, 1과 마지막 사이에 있을 경우 3가지로 구분
        if (index == length) {
            getIndexNode(index-1).setNext(null);
        } else if (index == 1){
            start = getIndexNode(2);
        } else {
            getIndexNode(index-1).setNext(getIndexNode(index+1));
        }

        length--;
    }

    public Node<T> getIndexNode(int index){
        Node<T> target = start;
        for (int i = 0; i < index-1; i++) {
            target = target.getNext();
        }
        return target;
    }
}

