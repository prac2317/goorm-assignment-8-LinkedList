
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
        System.out.println(myLinkedList.get(0)); // 첫번째 1
        System.out.println(myLinkedList.get(1)); // 중간 2
        System.out.println(myLinkedList.get(3)); // 마지막 4
//        System.out.println(myLinkedList.get(5)); // 범위 초과
//        System.out.println(myLinkedList.get(-1)); // 범위 초과
        System.out.println();


        System.out.println("[delete 테스트]");
//        myLinkedList.delete(-1); // 범위 초과
//        myLinkedList.delete(5); // 범위 초과
        myLinkedList.delete(3); // 마지막 제거 [1, 2, 3]
        System.out.println(myLinkedList.get(2)); // 3
        myLinkedList.delete(1); // 중간 제거 [1, 3]
        System.out.println(myLinkedList.get(1)); // 3
        myLinkedList.delete(0); // 첫번째 제거 [3]
        System.out.println(myLinkedList.get(0)); // 3

//        System.out.println("[for-each 순회 테스트]");
//        for (Integer i : myLinkedList) {
//            System.out.println(i);
//        }


        System.out.println("[stack 테스트]");
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty()); // true
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.peek()); // 7
        System.out.println(stack.size()); // 3
        System.out.println(stack.pop()); // 7
        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 3
        System.out.println(stack.isEmpty()); // true

        System.out.println("[queue 테스트]");
        Queue<Integer> queue = new Queue<>();
        System.out.println(queue.isEmpty()); // true
        queue.enqueue(3);
        queue.enqueue(5);
        System.out.println(queue.size()); // 2
        queue.enqueue(7);
        System.out.println(queue.peek());  // 3
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 5
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.dequeue()); // 7

    }
}
