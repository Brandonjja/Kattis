# Parking https://open.kattis.com/problems/parking2

n = int(input())
for _ in range(n):
    x = int(input())
    a = list(map(int, input().split()))
    a.sort()
    dis = 0
    for i in range(x):
        try:
            dis +=  abs(a[i] - a[i + 1])
        except IndexError:
            break
    print(dis * 2)
