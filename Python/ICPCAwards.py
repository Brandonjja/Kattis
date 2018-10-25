# ICPC Awards https://open.kattis.com/problems/icpcawards

n = int(input())
list = []
c = 0
for i in range(n):
	team = input().split()
	if team[0] not in list:
		if c < 12:
			list.append(team[0])
			print(team[0], team[1])
			c += 1