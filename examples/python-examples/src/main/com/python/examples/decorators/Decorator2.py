# Example 1
# print("Example2")


def printmsg(func):
    print("Hi this is decorator example 2")
    func()
    return printmsg

@printmsg
def callprintmsg():
    print("This is called function")

# Above decorator is equivalent to below snippet
def callprintmsg():
    print("This is called function")
mymsg = printmsg(callprintmsg)

# Example 2 with parameters


def smart_divide(func):
    def my_inner(a,b):
        print("I am going to divide", a, "and", b)
        if b == 0:
            print("oops! cannot divide")
            return

        return func(a,b)
    return my_inner


@smart_divide
def divide(a,b):
    return a/b

divide(1,2)
divide(1,0)
