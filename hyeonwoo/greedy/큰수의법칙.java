package greedy;

import java.util.Scanner;

public class 큰수의법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 크기");
        int n = sc.nextInt();
        System.out.print("몇번 더할지 ");
        int m = sc.nextInt(); // m 번 더할거임
        System.out.print("최대 덧셈 수 ");
        int k = sc.nextInt(); // k 번 초과할수 없음
        // k <= m

        int[] arr = new int[n];
//        int[] arr = {2,4,5,4,6};
        int max = 0; // 최댓값 지정
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }

        int second = 0; // 최댓값 바로 다음값?
        int count = 0;
        for (int i : arr) {
            if (i == max) {
                count++;
            } else if (i > second) { // 중복 없으면 second 값
                second = i;
            }
        }

        if (count != 1) second = max; // 최댓값이 중복되면 second 에 최댓값

        int result = 0;
        while (m != 0) {
            result += max * k;
            m -= k; // 큰수를 k번 더함
            if (m != 0) {
                result += second;
                m--;
            } else break;
        }
        System.out.println("result = " + result);
    }
}

