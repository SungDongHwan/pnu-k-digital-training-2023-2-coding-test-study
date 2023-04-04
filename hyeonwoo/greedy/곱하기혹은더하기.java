package greedy;

import java.util.Arrays;

public class 곱하기혹은더하기 {
    /*
    * 자리가 숫자로만 이루어진 문자열 S 왼쪽부터 숫자를
    * 확인해 x 혹은 +를 넣어 결과가 가장 큰 값을 만들도록
    *  모든 연산은 왼쪽부터 순서대로(+가 먼저라고 하더라도)*/

    public static void main(String[] args) {
//        int a = 2000000000;
//        String s = "567"; // result = 210
        String s = "02984"; // result = 567
        
        // 각 자리수 문자열을 정수배열로 저장
        int[] ints = new int[s.length()]; // 문자열 크기만큼 배열 선언
        for (int i = 0; i < s.length(); i++) {
            ints[i] = Character.getNumericValue(s.charAt(i));
        }
        System.out.println(Arrays.toString(ints)); //  배열 확인

        int result = ints[0]; // 맨 처음 숫자를 result 로 저장

        for (int i = 0; i < ints.length-1; i++) { // 마지막 이전 인덱스까지만 확인
            if((ints[i] == 0 || ints[i+1] == 0) ||     // 둘중 하나라도 0이거나
                    (ints[i] == 1 || ints[i+1] == 1)){ // 둘중 하나라도 1이면 더한다.
                result += ints[i+1];
            }else { // 나머지 경우에 다음 수( ints[i+1] )를 곱한다 .
                result *= ints[i+1];
            }
        }

        /*교재 내용*/
        int result1 = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) -'0';
            if(num <= 1 || result1 <= 1){
                result1 += num;
            }else result1 *= num;
        }

        System.out.println(result);
        System.out.println(result1);

    }
}
