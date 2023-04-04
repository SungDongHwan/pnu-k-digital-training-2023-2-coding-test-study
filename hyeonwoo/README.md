## 이번 주 과제
> 백준
- 단계별로 풀어보기 - 그리디 알고리즘
- 
> 프로그래머스
- Lv.1 하루 2문제 

## 4/1 그리디 강의
- 강의 - 거스름돈, 1될때까지, 곱하기 or 더하기, 큰 수의 법칙, 모험가길드
<br />
<br />

## 프로그래머스
### LV1.로또최고최저 Map 순회 시  NullPointerException 방지
    - test case 에 0, 1 이 올 경우도 대비하여 맵에 넣어준다
### LV1.둘만의 암호 - 미결
    - char 아스키 코드값으로 풀려하는데 z에서 인덱스 초과하는 부분..

## 백준
### _10610_30 런타임 에러 NumberFormatException - 미결
    - 10만 자리수를 long 으로 받으려 해도 NumberFormatException.
    - BingInteger 로 되는지 알아보기
### _1541_잃어버린괄호 index 에러
    - test case 마다 배열 크기가 다르므로 예외처리 line 30
### _11047_동전0
    - 동전하나로 딱 나누어 떨어질때 예외 처리 line 24


```java
import java.util.HashMap;
import java.util.Map;

public class 로또최고최저 {
    public static void main(String[] args) {
        Map<Integer, Integer> rank = new HashMap<>(); // 맞춘 갯수 : 랭크
        rank.put(6,1);
        rank.put(5,2);
        rank.put(4,3);
        rank.put(3,4);
        rank.put(2,5);
        rank.put(1,6); // NullPointerException 때문에 
        rank.put(0,6); // 2개 추가

     }
    }

```