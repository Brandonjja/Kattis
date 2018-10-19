# Cetvrta https://open.kattis.com/problems/cetvrta

a = input().split()
b = input().split()
c = input().split()

for x in range(0,2):
	a[x] = int(a[x])
	b[x] = int(b[x])
	c[x] = int(c[x])

if (a[0] == b[0]):
	x = c[0]
elif (a[0] == c[0]):
	x = b[0]
else:
	x = a[0]

if (a[1] == b[1]):
	y = c[1]
elif (a[1] == c[1]):
	y = b[1]
else:
	y = a[1]

print(x, y)