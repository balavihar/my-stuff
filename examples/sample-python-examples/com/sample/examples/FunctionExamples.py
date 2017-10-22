
def myfunc():
    #print("before pass")
    pass
    #print("pass")

myfunc()

# we can also declare 2 functions with same name like below, it executes latest one.
def test():   # test function with only one statement
    i = 100
#print(test())
def test():   # test function with only one statement
    i = 100
    return 100
#print(test())

# Return multiple values from function returned as tuple

def testMultiReturn():
    return 10, "hello", 2.5, 'yes'
print(type(testMultiReturn()))
print(testMultiReturn())
#print(" ".join(testMultiReturn()))
#print(" ".join(str(next(value))) for value in testMultiReturn())
print(next(value) for value in testMultiReturn())
for value in testMultiReturn():
    print(value)
def testMultiReturn1():
    return "Hi", "This", "is", "my", "first", "function"

print(testMultiReturn1())
print(type(testMultiReturn1()))
print(" ".join(testMultiReturn1()))
print(" ".join(value) for value in testMultiReturn1())
print(type(value) for value in testMultiReturn1())

#print(len(testMultiReturn()))
#print(testMultiReturn())
#print(testMultiReturn()[0:3])
#print("".join(str(testMultiReturn()[0:4])))
#print([" ".join(str(v)) for v in testMultiReturn()])
#print(" ".join(str((testMultiReturn()))))
#print(" ".join(("Hi", "This", "is", "my", "Python", "App.")))

def getStringsInTuple():
    return ("Hi", "This", "is", "my", "Python", "App.")

#print("".join(getStringsInTuple()))
tuple_from_func = testMultiReturn()
#print("".join(str(tuple_from_func)))
#print("ex1")
#for v in tuple_from_func:
    #print(v)

#print("ex2")
new_str = ""
for v in tuple_from_func:
    new_str = new_str + "".join(str(v))

#print(new_str)
#print(" ".join(str(v)) for v in tuple_from_func)

#print("bhima" + "Vihar")

#function with default value.

def testMultiReturn():
    return 10, "hello", 2.5, 'yes'
def print_value(val=1000):

    return val

#print_value()

#print(print_value(v for v in testMultiReturn()))

x = testMultiReturn()
xx =(y for y in x)
print("hiiiiiiiiiiiiiiiiii : ")
print(next(xx), next(xx))
print(next((y for y in x)), next((y for y in x)))


