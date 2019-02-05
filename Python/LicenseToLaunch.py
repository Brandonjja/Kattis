# License to Launch https://open.kattis.com/problems/licensetolaunch

n = int(input())
d = list(map(int, input().split()))

min = d[0]
mi = 0

for i in range(1, n):
    if d[i] < min:
        min = d[i]
        mi = i
print(mi)
