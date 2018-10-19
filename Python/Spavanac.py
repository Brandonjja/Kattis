# Spavanac https://open.kattis.com/problems/spavanac

data = input().split()
h = int(data[0])
m = int(data[1])

m -= 45

if (m < 0):
	m *= -1
	m = 60 - m
	if (h < 1):
		h = 23
	else:
		h -= 1


print (h, m)