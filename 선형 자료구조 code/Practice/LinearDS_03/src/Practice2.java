// Practice2
// 배열 arr 에서 target 에 해당하는 값의 인덱스를 출력
// 해당 값이 여러 개인 경우 가장 큰 인덱스 출력

// 입출력 예시)
// 배열 arr: 1, 1, 100, 1, 1, 1, 100
//target : 100
// 결과: 6

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
        int tagrget = 100;
        int indexMax =-1; // 타겟이 인덱스가 몇번째인지를 찾을 변수

        for(int i=0; i<arr.length; i++) { // 배열을 순회하면서
            if(arr[i] == tagrget) { // 배열에 타겟과 같은 값이 있으면
                if(i > indexMax) {// 해당하는 i가 기존의 index값보다 크면
                    indexMax = i; // 갱신해줘서 가장 큰 인덱스를 가질수 있도록 만들어 준다.
                }
            }
        }
        // 찾고자 하는 값이 있었으니까 출력된다.
        if(indexMax >= 0) {
            System.out.println(indexMax);
        }

    }
}
