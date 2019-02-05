# Quality-Adjusted Life-Year https://open.kattis.com/problems/qaly

n = int(input())
ans = 0

for _ in range(n):
    data = input().split()
    ans += float(data[0]) * float(data[1])
print(ans)
