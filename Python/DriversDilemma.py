# Diver's Dilemma https://open.kattis.com/problems/driversdilemma

data1 = input().split()
c = float(data1[0])
x = float(data1[1])
m = float(data1[2])
ans = 0
for i in range(6):
    data = list(map(float, input().split()))
    a = ((0.5 * c) - ((m / data[0]) * x)) * data[1]
    if a >= m:
        ans = int(data[0])

if ans != 0:
    print("YES " + str(ans))
else:
    print("NO")
