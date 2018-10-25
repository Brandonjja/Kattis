# Kornislav https://open.kattis.com/problems/kornislav

data = list(map(int, input().split()))

m1 = min(data)
m2 = max(data)

for x in range(len(data)):
	if (data[x] == m2):
		data[x] = 0
		break

print(m1 * max(data))