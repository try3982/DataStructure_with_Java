// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

// 입출력 예시)
// arr: 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과: 1, 5, 3, 2, 4

public class Practice6 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] arrResult = new int[5];
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for(int j=0; j <cnt; j++) {
                if(arr[i] == arrResult[j]) {
                    flag = true;
                }
            }
            if(flag == false) {
                arrResult[cnt++] = arr[i];
            }
        }
        for(int i = 0; i < cnt; i++) {
            System.out.println(arrResult[i] + "");
        }
        System.out.println();
    }
}
