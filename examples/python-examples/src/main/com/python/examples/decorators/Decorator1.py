# Example 1
def inc(x):
    return x + 1

def dec(x):
    return x - 1

def operate(func, x):
    result = func(x)
    return result
print("Example1")
print(operate(dec, 2))
print(operate(inc, 2))

