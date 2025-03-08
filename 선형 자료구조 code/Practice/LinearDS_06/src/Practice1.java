// Practice1
// ArrayList 를 이용한 스택 구현

import java.util.ArrayList;
// 스택 직접 구현해보기
class MyStack1 {
    ArrayList list;

    MyStack1() {
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
            System.out.println("Stack is empty");
            return null;
        }else {
            int data = (int)this.list.get(this.list.size()-1); // 리스트의 최대사이즈 -1을 하면 리스트의 가장 끝을 가져올수 있다.
            this.list.remove(this.list.size()-1);
            return data;
        }
    }

    public Integer peek() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        int data = (int)this.list.get(this.list.size()-1); // 리스트의 최대사이즈 -1을 하면 리스트의 가장 끝을 가져올수 있다.
        return data;

    }

    public void printStack() {
        System.out.println(this.list);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        MyStack1 myStack = new MyStack1();
        myStack.isEmpty();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printStack();               // 1, 2, 3, 4, 5

        System.out.println(myStack.peek()); // 5
        myStack.printStack();               // 1, 2, 3, 4, 5

        System.out.println(myStack.pop());  // 5
        System.out.println(myStack.pop());  // 4
        myStack.printStack();               // 1, 2, 3

        System.out.println(myStack.pop());  // 3
        System.out.println(myStack.pop());  // 2
        System.out.println(myStack.pop());  // 1
        myStack.printStack();
    }
}
