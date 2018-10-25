c = float(input())
n = int(input())
sum = 0
for x in range(n):
    data = input().split()
    a = float(data[0])
    b = float(data[1])
    sum += (a * b)
print(sum * c)
