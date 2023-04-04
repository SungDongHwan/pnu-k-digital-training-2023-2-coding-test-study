# 부산대학교 K-Digital Training 2023-2 Coding Test Study
<br/>

> 교재 
- 이것이 취업을 위한 코딩 테스트다 with 파이썬(한빛미디어 나동빈 지음)
- [유튜브 채널 동빈나](https://www.youtube.com/@dongbinna)
- [교재 Java 소스코드(ndb796/python-for-coding-test)](https://github.com/ndb796/python-for-coding-test)
<br />

> 플랫폼
- [백준](https://www.acmicpc.net/)
- [프로그래머스](https://programmers.co.kr/)
<br />

## OT
- 인텔리제이 설치
- D2Coding font
- repository fork
- branch
- 각자 패키지 폴더 생성
- 유튜브 채널
- README.MD 작성
- 스터디 방식 논의
- 단축키
- auto import
- 백준 환경 세팅 - solved.ac 
- 백준 문제 제출 시 format

<br />

## 이번 주 정기 스터디 시간에 풀 문제
##### 매주 월요일 업데이트!
- 백준 11399 ATM
- 백준 13305 주유소

<br />

## 이번 주 과제 
> 백준 
- 단계별로 풀어보기 - 그리디 알고리즘
> 프로그래머스
- Lv.1 하루 2문제 

<br />

## 4월의 목표
- 교재 -  PART 02 한 chapter씩 
- 백준 - 교재 파트 따라서 단계별로 풀어보기 진행
- 프로그래머스 - Lv.1 하루 2문제

<br />

## 진행 상황
<table>
 <tr>
    <td>진행 기간</td>
    <td>2023.03.31 ~</td>
  </tr>
  <tr>
    <td>정기 스터디 시간</td>
    <td>매주 화요일 18:00 ~ 20:00 [2h]</td>
  </tr>
</table>

<br />

|주차|날짜|Chapter|백준|
|---|---|---|---|
|Week00|2023.03.31|OT| |
|Week01|2023.04.04 ~ 2023.04.10|03 그리디|그리디 알고리즘|
<br/>

## 진행 방식
- 과제로 나온 문제 중 이해 안되는 문제 같이 풀어보기
- 정기 스터디 시간에 2문제 각자 풀기
- 다 푼 후 자신이 푼 알고리즘 방식 설명(2 ~ 3명)
- 교재 내용 순서대로 한 주에 한 챕터 진행
- 일요일까지 PR
<br />

## 백준 제출 시 포맷
> 자바 입출력 포맷 예시
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class Node { // inner class 사용 -> 패키지 내 중복 방지
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
    ...
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄씩 입력(br.readLine()) -> String
       
        int n = Integer.parseInt(st.nextToken()); // String -> int
        int m = Integer.parseInt(st.nextToken()); 
        
        String array[] = br.reandLine().split(" "); // 공백마다 데이터 끊어서 배열에 넣음
        ...
        
        
        String s = "abc";
        bw.write(s + "\n"); // String으로 출력,줄바꿈 필요 시 "\n"
        // 출력 결과
        // a
        // b
        // c
        bw.close(); // 스트림 닫음
    }
}
```
<br />

> 파이썬 입력 예시
```python
import sys

input = sys.stdin.readline
n, m = map(int, input().split())
```
<br />


## Commit & Pull Request
> Commit
```
git add .
```
```
git commit -m "commit message"
```
```
git push origin main
```
<br />

> Pull Requests
- New pull request
- Create pull request
- [fork해서 Pull Request 보내는 법](https://wayhome25.github.io/git/2017/07/08/git-first-pull-request-story/)
- [fork된 레포지토리 최신상태 유지하는 법](https://jybaek.tistory.com/775)

<br />

### 참고한 GitHub Repository
- https://github.com/ellynhan/challenge100-codingtest-study
- https://github.com/Seongho0503/Algo_Study
- https://github.com/CodeTest-StudyGroup/Code-Test-Study
- https://github.com/b1urrrr/Algorithm-Study
- https://github.com/CodeSquad-2023-BE-Study/Algorithm-Study
- https://github.com/tony9402/baekjoon
