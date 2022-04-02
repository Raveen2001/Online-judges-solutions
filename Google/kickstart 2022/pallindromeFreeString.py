def isPallindromeFreeStringPossible(s, i):
    while(i != len(s) and s[i] != '?'):
        i += 1

    if(i == len(s)):
        j = 0
        while j <=len(s) - 5:
            if isPallindrome(s[j: j + 5]) or isPallindrome(s[j: j + 6]):
                return False
            j+=1
        if isPallindrome(s[j : j+5]):
            return False

        return True
    s1 = s[:i] + "0" + s[i+1:]
    res = isPallindromeFreeStringPossible(s, i+1)
    if not res:
        s2 = s[:i] + "1" + s[i+1:]
        return isPallindromeFreeStringPossible(s, i+1)
    return True


def isPallindrome(s):
    return (len(s) >= 5) and (s == s[::-1])

t = int(input())
# t = 1
for i in range(1,t+1):
    n = int(input())
    # n = 5
    # s = "100???001"
    s = input()
    print("Case {}: {}".format(i,"POSSIBLE" if isPallindromeFreeStringPossible(s, 0) else "IMPOSSIBLE"))



