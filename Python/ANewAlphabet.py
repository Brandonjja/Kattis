# A New Alphabet https://open.kattis.com/problems/anewalphabet

dict = {' ':' ','a':'@', 'b':'8', 'c':'(', 'd':'|)', 'e':'3', 'f':'#', 'g':'6', 'h':'[-]', 'i':'|', 'j':'_|', 'k':'|<',
'l':'1', 'm':'[]\/[]', 'n':'[]\[]', 'o':'0', 'p':'|D', 'q':'(,)', 'r':'|Z', 's':'$', 't':"']['", 'u':'|_|',
'v':'\/', 'w':'\/\/', 'x':'}{', 'y':'`/', 'z':'2'}

data = list(input())
s = ''
for i in range(len(data)):
	if data[i].lower() in dict:
		s += dict[data[i].lower()]
	else:
		s += data[i]
print(s)
