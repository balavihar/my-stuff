def make_multiplier_of(n):
    def multiplier(x):
        return x * n
    return multiplier

# Multiplier of 3
times3 = make_multiplier_of(3)

# Multiplier of 5
times5 = make_multiplier_of(5)

# Output: 27
print(times3(9))

# Output: 15
print(times5(3))

# Output: 30
print(times5(times3(2)))

def multiply(n, x):
    timesN = make_multiplier_of(n)
    print(timesN(x))

multiply(5, 5)

print(__name__)

class Test(object):
    print(__name__)
    def __init__(self):
        print(__name__ + "aaa")
    def test_method(self) :
        print(__name__)

print(Test().test_method())
print(Test.__name__)