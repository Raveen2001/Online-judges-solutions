def getNumberOfExtraLettersTyped(s, p):
    pointer1 = 0
    pointer2 = 0
    while(pointer2 != len(p) and pointer1 != len(s)):
        if(s[pointer1] == p[pointer2]):
            pointer1 += 1
        pointer2 += 1
    
    if(pointer1 != len(s)):
        return -1
    else:
        return len(p) - len(s)


t = int(input())
for i in range(1, t + 1):
    s = input()
    p = input()
    res = getNumberOfExtraLettersTyped(s, p)
    print("Case #{}: {}".format(i, res if res != -1 else "IMPOSSILBE"))

