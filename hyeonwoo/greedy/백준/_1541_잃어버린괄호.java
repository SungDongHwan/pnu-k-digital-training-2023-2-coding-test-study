package greedy.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1541_잃어버린괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] sarr = s.split("-"); // 빼기로 스플릿

        int[] sum = new int[sarr.length];

        for (int i = 0; i < sum.length; i++) {
            if(!sarr[i].contains("+")) sum[i] = Integer.valueOf(sarr[i]); // + 기호 없으면 그 값을 저장
            else { // 있으면?
                String[] temps = sarr[i].split("\\+"); // + 기호로 한번더 스플릿
                int sum_temps = 0;
                for (int j = 0; j < temps.length; j++) {
                    sum[i]+= Integer.valueOf(temps[j]); // 정수값들을 다 더해서 저장
                }
//                sum[i] = sum_temps;
            }
        }
        int result = sum[0];
        // 배열이 하나짜리면
        if(sum.length > 1){ // 이 조건 없으면 런타임 에러 out of index
            for (int i = 1; i < sum.length; i++) {
                result -= sum[i];
            }
        }
        System.out.println(result);



    }
}
