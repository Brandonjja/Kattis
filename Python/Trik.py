# Trik https://open.kattis.com/problems/trik

data = list(str(input()))
c = 1
for i in range(len(data)):
	if (data[i] == 'A' and c == 1):
		c = 2
	elif (data[i] == 'A' and c == 2):
		c = 1
	elif (data[i] == 'B' and c == 2):
		c = 3
	elif (data[i] == 'B' and c == 3):
		c = 2
	elif (data[i] == 'C' and c == 3):
		c = 1
	elif (data[i] == 'C' and c == 1):
		c = 3
print(c)