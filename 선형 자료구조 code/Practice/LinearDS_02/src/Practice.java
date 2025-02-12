// Practice
// 기본 배열 자료형을 이용한 배열의 생성, 삽입, 삭제 기능 구현

import java.util.Arrays;

class MyArray {

    int[] arr;

//  배열의 초기 사이즈 설정
//    클래스를 생성할떄 사이즈를 받아서 만들어 줄수 있도록 생성자 선언
    MyArray(int size) {
        //사이즈를 받는다.
        this.arr = new int[size];
    }


//  배열에 데이터 삽입
//    특정 위치에 값을 추가하는 함수
    public void insertData(int index, int data) {
        //예외처리 먼저
        if(index < 0 || index > arr.length) {
            System.out.println("Index Error");
            return;
        }
        //정상 범위의 인덱스가 들어오면 진행
        //기존 배열의 데이터들을 arrDup에 복사 해놓는다.
        int[] arrDup = this.arr.clone();
        //데이터가 하나 추가 될거니까 기존의 배열의 사이즈보다 하나 더 큰  배열을 만들어 준다.
        this.arr = new int[this.arr.length +1];

        // 데이터를 추가하려는 인덱스 위치까지는 기존의 배열에 들어있던 데이터를 다시 할당해주고
        for(int i=0; i<index; i++) {
            this.arr[i] = arrDup[i];
        }
        // 데이터를 추가하려고 하는 위치 그다음부터 그 배열의 끝자리까지도 기존의 배열을 갖고 데이터를 할당해준다.
        for(int i= index + 1; i < this.arr.length; i++) {
            this.arr[i] = arrDup[i - 1];
        }
        //그리고 나서 위의 (int index, int data)에 데이터를 넣어준다.
        this.arr[index] = data;
    }


//  배열에서 특정 데이터 삭제
//    데이터를 삭제할때 들어온 데이터를 찾아서 삭제 해준다
    public void removeData(int data) {
        int targetIndex = -1;

        // 들어온 데이터가 배열에 있는지 찾아본다.
        for(int i=0; i<this.arr.length; i++) {
            if(this.arr[i] == data) { // 데이터가 있으면
                targetIndex = i;
                break; // 더이상 찾을 필요 없으니까

            }
        }
        // 찾은 데이터가 없으면
        if(targetIndex == -1) {
            System.out.println("해당 데이터가 없습니다.");
        }else {
            int [] arrDup = this.arr.clone(); // 기본 배열을 arrrDup에 복제
            this.arr = new int[this.arr.length -1]; // 배열을 사이즈 하나 줄여서 다시 만들어준다.

            for(int i=0; i<targetIndex; i++) { // 지우려고 하는 인덱스 위치 전까지
                this.arr[i] = arrDup[i]; // 기존 배열을 다시 넣어주고
            }

            for(int i=targetIndex; i < this.arr.length; i++) { // 지우려고 하는 데이터는 빼고
                this.arr[i] = arrDup[i + 1]; // 나머지 데이터만 새로 만들어준 배열에 들어간다.
            }
        }

    }


}

public class Practice {
    public static void main(String[] args) {

//      Test code
        int size = 5;
        MyArray myArray = new MyArray(size);

        for (int i = 0; i < size; i++) {
            myArray.arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray.arr));   // [1, 2, 3, 4, 5]

        myArray.arr[0] = 10;
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 3, 4, 5]

        myArray.insertData(2, 20);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 4, 5]

        myArray.insertData(6, 60);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 4, 5, 60]

        myArray.insertData(-1, 0);  // Index Error

        myArray.removeData(4);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 5, 60]

        myArray.removeData(5);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 60]

        myArray.removeData(99); // 해당 데이터가 없습니다.*/
    }
}
