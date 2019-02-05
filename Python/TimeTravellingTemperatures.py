# Time Travelling Temperatures https://open.kattis.com/problems/temperature

l = input().split(" ")
x = int(l[0])
y = int(l[1])

if y == 1 and x == 0:
    print("ALL GOOD")
elif y == 1:
    print("IMPOSSIBLE")
else:
    print(x / (1 - y))
