package greedy.백준;

import java.util.Scanner;

public class _11047_동전0 {
    /*준규가 가지고 있는 동전은 총 N 종류이고, 각각의 동전을 매우 많이 가지고 있다.
    동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다.
     이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num = (int) 10e5;
//        System.out.println(num);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];

        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = coins.length-1; i >= 0; i--) {
            if(k >= coins[i]){ // 딱 떨어맞을수도 있으니 "=" 포함해주어야함
                cnt += k/coins[i]; // 몇번 거슬러 주었는지? 몫을 더함
                k %= coins[i]; // 나머지 저장
            }
        }

        System.out.println(cnt);


    }
}
