# Dice Cup https://open.kattis.com/problems/dicecup

data = input().split()

a = int(data[0])
b = int(data[1])

if (a == b):
	print(a + 1)
else:
	for x in range(min(a, b), max(a, b) + 1):
		print(x + 1)