import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int N = Integer.parseInt(br.readLine());
        // 도시의 갯수를 나타내는 정수
        int n = Integer.parseInt(br.readLine());
        // 도로의 길이
        StringTokenizer st = new StringTokenizer(br.readLine());
        long len[] = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            len[i] = Integer.parseInt(st.nextToken());
        }

        // 주유소의 리터당 가격
        st = new StringTokenizer(br.readLine());
        long liter[] = new long[n];
        for (int i = 0; i < n; i++) {
            liter[i] = Integer.parseInt(st.nextToken());
        }
        long price = 1000000000;
        long result = 0;
        // idea: 도시의 개수를 받아서, 배열로 리터당 가격을 각자 받아서 가장 낮은것부터
        // 가져와서 가장 낮은곳이 배열의 몇번째인지 확인후 이후의 가격은 모두 더해서 곱한다.
        // 이후 가장낮은것 앞을 잘라서, 위의 결과를 반복한다.(배열이 1개 남으면 끝낸다)
        // 하지만 실제로는 바로 앞의 것만 비교해서
        for (int i = 0; i < len.length; i++) {
            if (liter[i] < price) {
                price = liter[i];
            }
            result += price * len[i];

        }
        System.out.println(result);
    }
}
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        Integer len[] = new Integer[n - 1];
//        for (int i = 0; i < n - 1; i++) {
//            len[i] = Integer.parseInt(st.nextToken());
//        }
//
//        st = new StringTokenizer(br.readLine());
//        Integer liter[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            liter[i] = Integer.parseInt(st.nextToken());
//        }
//        int result = 0;
//        while (n > 1) {
//            int minIndex = 0;
//            for (int i = 0; i < n-1; i++) {
//                if (liter[i] < liter[i+1]) {
//                    minIndex = i;
//                }
//            }
//            int sumLen = 0;
//            for (int i = minIndex; i < n - 1; i++) {
//                sumLen += len[i];
//            }
//            result += liter[minIndex] * sumLen;
//            n = minIndex;
//
//            if(n==1)result += liter[0]*len[0];
//        }
//        System.out.println(result);
//
//    }
//}

