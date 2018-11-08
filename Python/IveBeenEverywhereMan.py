# I've Been Everywhere, Man https://open.kattis.com/problems/everywhere

n = int(input())
for a in range(n):
	list = []
	b = int(input())
	for i in range(b):
		p = input()
		if p in list:
			continue
		else:
			list.append(p)
	print(len(list))