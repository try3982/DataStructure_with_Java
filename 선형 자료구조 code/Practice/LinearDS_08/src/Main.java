// 선형 자료구조 - 큐


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new LinkedList();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.poll()); // 데이터 하나 빼기
        System.out.println(queue);

        System.out.println(queue.peek()); // 가장 먼저 들어온 데이터 출력
        System.out.println(queue);
        System.out.println(queue.contains(3)); // 3이 들어있냐
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        queue.clear(); // 큐 삭제
        System.out.println(queue);
        System.out.println(queue.poll());

    }
}
