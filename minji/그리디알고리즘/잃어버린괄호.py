s = input().split('-')
arr = []
for i in s:
    sum_p = 0
    tmp = i.split('+')
    for j in tmp:
        sum_p += int(j)
    arr.append(sum_p)
result = arr[0]
for i in range(1, len(arr)):
    result -= arr[i]
print(result)