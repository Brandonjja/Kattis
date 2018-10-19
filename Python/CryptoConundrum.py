# Cryptographer's Conundrum https://open.kattis.com/problems/conundrum

line = list(input())
c = 0
count = 0
while (c < len(line)):
	if (line[c] != 'P'):
		count += 1
	c += 1
	if (c >= len(line)):
		break
	if (line[c] != 'E'):
		count += 1
	c += 1
	if (line[c] != 'R'):
		count += 1
	c += 1
print(count)