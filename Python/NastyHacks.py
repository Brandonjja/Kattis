# Nasty Hacks https://open.kattis.com/problems/nastyhacks

n = int(input())

for x in range(n):
	data = list(map(int, input().split()))
	cost = data[1] - data[2]
	if (cost > data[0]):
		print("advertise")
	elif (cost == data[0]):
		print("does not matter")
	else:
		print("do not advertise")