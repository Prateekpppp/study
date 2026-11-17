k=3
arr = [5,6,7,8,11,3,2,1,9]
maxi = sum(arr[0:k])

maximum = sum(arr[0:k])

for i in range(k,len(arr)):
    print(f'i----{i}')
    print(maximum)
    maxi += arr[i]
    maxi -= arr[i-k]
    print(f'maxi---{maxi}')
    maximum = max(maxi,maximum)

return maximum
