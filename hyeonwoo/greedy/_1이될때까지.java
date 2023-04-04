package greedy;

public class _1이될때까지 {
    /*
    * 자연수 n,k
    * 방법1. n = n -1
    * 방법2. n /= k
    * 몇번만에 1이 되니?
    * */
    public static void main(String[] args) {
        int n = 17;
        int k = 4;

        System.out.println(solution(17,4));
    }

    public static int solution(int n , int k){
        int result = 0;
        while(n != 1){ // 1이 아닐동안 실행
            if(n%k == 0) n /= k; // 나누어 떨어지면 나누고
            else n -= 1; // 아니면 -1
            result++; // 카운트 +1
        }
        return result;
    }
}
