package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 모험가길드 {
    /*
    * n 명 모험가 공포도 x
    * 공포도 x 인 모험가는 x명 이상 그루핑 해야 모험할수 있음
    * 최대 몇개 그룹?

    * 조건
    * 첫 줄에  모험가수 n이 주어짐
    * 둘째 줄에 각 모험가의 공포도를 n 이하의 자연수로 입력
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("모험가 수");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr)); //  배열 확인



    }
}
