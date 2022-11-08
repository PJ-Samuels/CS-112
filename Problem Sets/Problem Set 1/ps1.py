a = True
b = True
c = False
d = False
e = False
skiResult = (a and b and c) or (a and b and d) or (b and c and d) or (a and c and d) or (a and b and e) or (a and c and e)or (a and d and e) or (b and c and e) or (b and d and e)
print(skiResult)
