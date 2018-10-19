# Quick Brown Fox https://open.kattis.com/problems/quickbrownfox

alpha = "abcdefghijklmnopqrstuvwxyz"
n = int(input())
for i in range(n):
	missing = ""
	line = input().lower()
	for a in alpha:
		if (a not in line):
			missing += a
	if (missing != ""):
		print("missing " + missing)
	else:
		print("pangram")