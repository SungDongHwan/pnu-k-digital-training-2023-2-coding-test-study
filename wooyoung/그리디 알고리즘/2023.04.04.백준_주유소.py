# n 개의 도시를 입력!!!
n = int(input())

road = list(map(int, input().split()))
price = list(map(int, input().split()))

# 첫번째는 무조건 넣아야 함으로
minPrice = price[0]

result = 0

# 비교해야 할 대상이 price이므로 road를 적는다.
for i in range(len(road)):
    # min(iterable1, iterable2, ...)
    # iterable1 과 iterable2 중에 작은걸 반환한다는 것

    # 둘이 비교해서 최솟값을  minPrice에 넣는다
    minPrice = min(minPrice, price[i])
    result = result + (minPrice * road[i])
print(result)