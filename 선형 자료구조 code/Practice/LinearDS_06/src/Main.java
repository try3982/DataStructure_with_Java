// 선형 자료구조 - 스택

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack); //[1, 2, 3, 4, 5]
        stack.pop();
        System.out.println(stack); //[1, 2, 3, 4]
        System.out.println(stack.pop()); //[1,2,3]

        System.out.println(stack.peek()); // 가장 마지막에 들어갔던 값을 반환

        System.out.println(stack.contains(1)); // 스택안에 데이터 1이 있냐? true 반환
        System.out.println(stack.size()); // 스택 사이즈 반환
        System.out.println(stack.isEmpty()); // 비어 있는지

        stack.clear(); //스택 초기화
        System.out.println(stack) ;





    }

}
