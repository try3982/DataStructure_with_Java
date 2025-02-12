// Practice1
// 배열 arr 의 모든 데이터에 대해서,
// 짝수 데이터들의 평균과 홀수 데이터들의 평균을 출력하세요.

// 입출력 예시)
// 배열 arr: 1, 2, 3, 4, 5, 6, 7, 8, 9
// 결과:
// 짝수 평균: 5.0
// 홀수 평균: 5.0

public class Practice1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        float sumEven = 0;
        float sumOdd = 0;
        int evenCnt = 0;
        int oddCnt = 0;
        // 총 합에서 갯수를 나누면 평균값(sumEven / evenCnt)


        for(int item:arr) {
            if(item%2 == 0) {
                sumEven += item; // 짝수들의 합을 계속 더해준다.
                evenCnt++;  // 짝수가 몇개인지 세어준다.
            }else {
                sumOdd += item;
                oddCnt++;
            }
        }
        System.out.println("짝수 평균 : " + sumEven / evenCnt);
        System.out.println("홀수 평균 : " + sumOdd / oddCnt);

    }

}
