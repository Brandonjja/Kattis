# Batter Up https://open.kattis.com/problems/batterup

n = int(input())
data = list(map(int, input().split()))
c = 0
sum = 0
for i in data:
	if i >= 0:
		c += 1
		sum += i
print (sum / c)