#길이가 N인 정수 배열 A와 B가 있다.
# int로 변환!
n = int(input())

# map함수를 이용하여 각각 정수형으로 (int)바꾼뒤에 n,k에 넣는다
# split() 입력값을 두 개 이상으로 분리
# n, k = map(int, input().split())

#S의 최솟값을 출력하는 프로그램을 작성
list_a = list(map(int, input().split()))
list_b = list(map(int, input().split()))

# list_a의 값을 내림 차순으로 정리한다
result_a = sorted(list_a, reverse=True)
result_b = sorted(list_b)

sum = 0

for i in range(0, n):
    sum = sum + ( result_a[i] * result_b[i])

print(sum)
