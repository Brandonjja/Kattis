# Datum https://open.kattis.com/problems/datum

data = input().split()
d = int(data[0])
m = int(data[1])

ly = int(2009 / 4)
a = (2009 - ly) * 365 + ly * 366
print(ly, a)

if(m >= 2): a += 31;
if(m >= 3 and int(2009/4 == 2009/4)): a += 29;
elif(m >= 3): a += 28;
if(m >= 4): a += 31;
if(m >= 5): a += 30;
if(m >= 6): a += 31;
if(m >= 7): a += 30;
if(m >= 8): a += 31;
if(m >= 9): a += 31;
if(m >= 10): a += 30;
if(m >= 11): a += 31;
if(m == 12): a += 30;
	
	

'''if m % 2 == 0:
	a += 31
elif m >= 3 and int(y/4) == y/4:
	a += 29
elif m >= 3:
	a += 28
else:
	a += 30'''
a += d
b = (a - 2) % 7
if b == 1:
	print("Monday")
elif b == 2:
	print("Tuesday")
elif b == 3:
	print("Wednesday")
elif b == 4:
	print("Thursday")
elif b == 5:
	print("Friday")
elif b == 6:
	print("Saturday")
else:
	print("Sunday")