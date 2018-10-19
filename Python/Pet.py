# Pet https://open.kattis.com/problems/pet

sum = [0, 0, 0, 0, 0]
for x in range(5):
	data = input().split()
	data = list(map(int, data))
	for i in range(4):
		sum[x] += data[i]

print(str((sum.index(max(sum)) + 1)) + " " + str(max(sum)))