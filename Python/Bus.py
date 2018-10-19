# Bus https://open.kattis.com/problems/bus

n = int(input())

for x in range(n):
	s = int(input())
	if (s == 1):
		print(1)
	else:
		a = 0
		for y in range(1, s):
			a += 1
			a *= 2
		print(int(a) + 1)