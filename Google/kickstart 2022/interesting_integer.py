from math import prod


def getSumAndProduct(n):
    sum = 0
    product = 1
    while(n > 0):
        rem = n % 10
        sum += rem
        product *= rem
        n //= 10

    # print(sum, product)
    return (sum, product)


def getNumberOfPossibleNumbers(a, b):
    n = a
    count = 0
    while(n <= b):
        sum, product = getSumAndProduct(n)
        count += 1 if (product % sum) == 0 else 0
        n += 1
    
    return count


t = int(input())

for i in range(1, t+1):
    a, b = list(map(int, input().split()))
    # print(a, b)
    print("Case #{}: {}".format(i, getNumberOfPossibleNumbers(a, b)))

# 1 1 1 1 1
# 1 1 ? 1 1 -> impossible *
# ? 1 1 1 1 -> possible
# 1 ? ? 1 1 -> possible
# 1 ? ? ? 1 -> possible
# 1 ? 0 ? 1 -> possbile
# 1 0 ? 0 1 -> impossible * \

# 1 1 ? ? 1 1 ->
# 1 1 0 1 1 1 -> possible

# 1 1 ? ? ? 1 1 ->
# 1 1 0 0 1 1 1 -> possible

# 1 1 1 ? 1 1 1 ->
# 1 1 ? ? 1 1 1 ->
# 1 1 0 1 1 1 1 -> possible
# 1 1 ? ? ? 

# 100???001
# 100111001


#100???001
#100???001

#fff