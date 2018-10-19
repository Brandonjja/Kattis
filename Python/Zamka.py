# Zamka https://open.kattis.com/problems/zamka

L = int(input())
D = int(input())
x = int(input())

sum = 0

for i in range(L, D+1):
	a = list(str(i))
	for j in range(len(a)):
		sum = sum + int(a[j])
	if (sum == x):
		print(i)
		break
	sum = 0

c = D

for i in range(L, D+1):
	a = list(str(c))
	sum = 0
	for j in range(len(a)):
		sum = sum + int(a[j])
	if (sum == x):
		print(c)
		break
	c = c - 1