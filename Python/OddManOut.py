# Odd Man out https://open.kattis.com/problems/oddmanout

n = int(input())
k = 0
for x in range(n):
	g = int(input())
	data = list(map(int, input().split()))
	for i in range(g-1):
		k += 1
		for j in range(k, g):
			if (data[i] == data[j]):
				data[i] = 0
				data[j] = 0
				break
	k = 0
	print("Case #" + str(x+1) + ": " + str(max(data)))