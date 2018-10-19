# Seven Wonders https://open.kattis.com/problems/sevenwonders

t = 0
c = 0
g = 0

data = list(input())

for i in range(len(data)):
	if (data[i] == 'T'):
		t += 1
	elif (data[i] == 'C'):
		c += 1
	else:
		g += 1
ans = int(t**2 + c**2 + g**2)
ans += 7 * min(max(t, c), g)
print(ans)