package greedy;

public class 거스름돈문제 {
/*
* 500,100, 50, 10 원이 무한히 존재 하고
* 거슬러 줘야할 돈이 N(10의 배수) 원일때 거슬러
*  주어야할 동전 최소 개수
* */
public static void main(String[] args) {
    int n = 1260;
    int[] coin = {500, 100, 50, 10};
    int cnt = 0;
    for (int c : coin) {
        cnt += n/c;
        n %= c;
    }

    System.out.println("n = " +n);
    System.out.println("cnt = " +cnt);
}

}
