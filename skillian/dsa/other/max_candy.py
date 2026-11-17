candies = [2,4,5,1,2]

extra = 2

res = []

max_candy = max(candies)

for i in candies:
    if i + extra >= max_candy:
        res.append(True)
    else:
        res.append(False)


print(res)