
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("[add 테스트]");
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println();

        System.out.println("[get 테스트]");
        System.out.println(myLinkedList.get(1)); // 첫번째 1
        System.out.println(myLinkedList.get(2)); // 중간 2
        System.out.println(myLinkedList.get(4)); // 마지막 4
        System.out.println(myLinkedList.get(6)); // 범위 초과
        System.out.println(myLinkedList.get(-1)); // 범위 초과
        System.out.println();

        System.out.println("[delete 테스트]");
        myLinkedList.delete(-1); // 범위 초과
        myLinkedList.delete(5); // 범위 초과
        myLinkedList.delete(4); // 마지막 제거 [1, 2, 3]
        System.out.println(myLinkedList.get(4)); // 범위 초과
        System.out.println(myLinkedList.get(3)); // 3
        myLinkedList.delete(2); // 중간 제거 [1, 3]
        System.out.println(myLinkedList.get(2)); // 3
        myLinkedList.delete(1); // 첫번째 제거 [3]
        System.out.println(myLinkedList.get(1)); // 3
    }
}
