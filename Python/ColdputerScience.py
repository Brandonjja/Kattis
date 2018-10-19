# Cold-puter Science https://open.kattis.com/problems/cold

n = int(input())

c = 0

data = input().split()
for x in range(0, n):
    d = int(data[x])
    if d < 0:
        c += 1

print(c)