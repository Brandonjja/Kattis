# Quite a Problem https://open.kattis.com/problems/quiteaproblem

while (1):
    try:
        line = input()
        if "problem" in line.lower():
            print("yes")
        else:
            print("no")
    except EOFError:
        break
