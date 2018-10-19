# Pot https://open.kattis.com/problems/pot

import math

n = int(input())
sum = 0
for x in range(n):
	a = int(input())
	p = a % 10
	a = int(a / 10)
	sum = sum + math.pow(a, p)
print(int(sum))