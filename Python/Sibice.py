# Sibice https://open.kattis.com/problems/sibice

data = input().split()
data = list(map(int, data))

import math

diag = math.sqrt(data[1] ** 2 + data[2] ** 2)

for x in range(data[0]):
	if (int(input()) <= diag):
		print("DA")
	else:
		print("NE")