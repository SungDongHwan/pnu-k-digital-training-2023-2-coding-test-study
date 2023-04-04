package greedy.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class _10610_30 {

/*어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다.
미르코는 30이란 수를 존경하기 때문에,
그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.
모든 수를 사용해야 하는것으로 보임
*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

//        int test = 1000000;
        
        // 30 // 3, 10 의 배수
        // 큰수가 먼저 되어야하고 0 이 맨 뒤로 와야하고(10의 배수)
        // 모든 자릿수의 합이 3의 배수여야 함 (3의 배수)
        long result = -1;
        while(s.contains("0")){ // "0" 이 있어야함. 10배수 확인
            char[] ch = s.toCharArray();
            long sum = 0; // 3배수 확인하는 정수
            for (Character c: ch ) {
                sum += Character.getNumericValue(c);
            }
            System.out.println("sum = " + sum);
            if((sum % 3) != 0) {
                System.out.println(result);
                break; // 3 배수 아니면 탈출
            }

            // 0을 뒤로 밀면 무조건 30의 배수가 됨
            Arrays.sort(ch); // 오름차순 정렬
            StringBuilder sb = new StringBuilder();
            for (int i = ch.length-1; i >= 0 ; i--) { // 배열 뒤에서부터 sb에 append
                sb.append(ch[i]);
            }
            System.out.println(BigInteger.valueOf(Long.valueOf(sb.toString())));
//            result = Long.valueOf(sb.toString());
//            System.out.println(sb.toString());
            break;
        }
    }
}
