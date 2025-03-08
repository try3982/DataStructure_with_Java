// Practice1
// ArrayList 를 이용한 큐 구현

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

class MyQueue1 {
    ArrayList list;

    MyQueue1() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
     if(this.list.size() == 0) {
         return true;
     }else {
         return false;
     }
    }

    public void push(int data) {
        this.list.add(data);

    }

    public Integer pop() {
     if(this.isEmpty()) {
         System.out.println("Queue is empty");
     }
     int data = (int)this.list.get(0); // 가장 처음에 있는 data를 꺼내감
        this.list.remove(0); // 꺼낸 데이터는 remove 해준다
        return data;
    }

    public Integer peek() {
        if(this.isEmpty()) {
            System.out.println("Queue is empty");
        }
        int data = (int)this.list.get(0); // 가장 처음에 있는 data를 꺼내감
//        this.list.remove(0); // 꺼낸 데이터는 remove 해준다.
        return data;
    }


    public void printQueue() {
        System.out.println(this.list);

    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        MyQueue1 myQueue = new MyQueue1();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);

        myQueue.printQueue();   // 1, 2, 3, 4, 5

        System.out.println(myQueue.peek()); // 1
        myQueue.printQueue();   // 1, 2, 3, 4, 5

        System.out.println(myQueue.pop());  // 1
        myQueue.printQueue();   // 2, 3, 4, 5

        System.out.println(myQueue.pop());  // 2
        myQueue.printQueue();   // 3, 4, 5

        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        myQueue.printQueue();
    }
}
