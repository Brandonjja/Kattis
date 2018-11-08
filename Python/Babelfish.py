# Babelfish https://open.kattis.com/problems/babelfish

dict = {}

while (1):
	data = input().split()
	if (len(data) == 0):
		break
	dict[data[1]] = data[0]
while (1):
	try:
		w = input()
		if (w == ""):
			break
		if w in dict.keys():
			print(dict[w])
		else:
			print("eh")
	except EOFError:
		break