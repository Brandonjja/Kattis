# Secure Doors https://open.kattis.com/problems/securedoors

n = int(input())
list = []
for i in range(n):
	data = input().split()
	if (data[0] == "entry"):
		if data[1] in list:
			print(data[1] + " entered (ANOMALY)")
		else:
			print(data[1] + " entered")
			list.append(data[1])
	else:
		if data[1] not in list:
			print(data[1] + " exited (ANOMALY)")
		else:
			print(data[1] + " exited")
			list.remove(data[1])