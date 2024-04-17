#put 5 values
nums = [10, 9, 5, 7, 11]
target = 20
# can be set to any target

def sum(target, nums):
    d = {}
    for i, n in enumerate(nums):
        if target - n in d: 
            return [d[target - n],i ]
        d[n] = i

print(sum(target, nums)) 