import math
hrs, mins = list(map(int, input().split(":")))
hrs = hrs * 5
# mins = mins/5;
mins = 60 - mins if hrs < 30 else mins
print(hrs, mins);
min1 = (60 - hrs) + mins
min2 = abs(hrs + mins)
print(min1, min2)
diff = min1 if min1<min2 else min2
print(diff * 6)