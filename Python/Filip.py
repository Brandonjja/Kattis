# Filip https://open.kattis.com/problems/filip

data = input().split()

data[0] = data[0][::-1]
data[1] = data[1][::-1]

data[0] = int(data[0])
data[1] = int(data[1])

print(max(data[0], data[1]))