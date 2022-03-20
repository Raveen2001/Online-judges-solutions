def getSmallestNumberDivisibleByNineByAddingSingleDigit(n):
    rem = n%9
    if(rem != 0):
        rem = 9 - rem
    strN = str(n)
    if(rem == 0):
        return strN[:1] + str(rem) + strN[1:]
    else:
        for i in range(len(strN)):
            if(strN[i] > str(rem)):
                return strN[:i] + str(rem) + strN[i:]
    return strN + str(rem)
    


t = int(input())
for i in range(1, t + 1):
    n = int(input())
    print("Case #{}: {}".format(i, getSmallestNumberDivisibleByNineByAddingSingleDigit(n)))