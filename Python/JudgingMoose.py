# Judging Moose https://open.kattis.com/problems/judgingmoose

l = input().split()
r = int(l[1])
l = int(l[0])

if (r == 0 and l == 0):
	print("Not a moose")
elif (r > l or l > r):
	print("Odd " + str(2*max(r, l)))
else:
	r += l
	print("Even " + str(r))