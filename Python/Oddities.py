# Oddities https://open.kattis.com/problems/oddities

n = int(input())

for x in range(n):
	a = int(input())
	if (a % 2 == 0):
		print(str(a) + " is even")
	else:
		print(str(a) + " is odd")