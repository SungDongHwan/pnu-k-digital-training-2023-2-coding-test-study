package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주유소 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cityNum = Integer.parseInt(br.readLine());

        long[] distance = new long[cityNum-1];
        long[] cost = new long[cityNum];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cityNum-1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cityNum; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        long result = 0;
        long minnum = cost[0];
        for (int i = 0; i < cityNum-1; i++) {
            minnum = Math.min(minnum, cost[i]);
            result += minnum * distance[i];
        }

        System.out.println(result);
    }
}
