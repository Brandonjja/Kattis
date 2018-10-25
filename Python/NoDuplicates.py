# No Duplicates https://open.kattis.com/problems/nodup

data = input().split()
flag = 0
for x in range(len(list(data))):
	for y in range(len(list(data))):
		if (data[x] == data[y]):
			if (x != y):
				print("no")
				flag = 1
				break
	if (flag == 1):
		break
if (flag == 0):
	print("yes")