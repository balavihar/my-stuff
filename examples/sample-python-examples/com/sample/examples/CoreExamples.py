# Type casting
i = 23.9797
print("rounding 23.9797 is :",round(i, 1))

i=int(input("Enter any number : "))
if i % 2 == 0:print("Number is even")
else:print("Number is odd")
# Tried for syntax above and below syntax's are differentbut works fine.
if i % 2 == 0:
    print("Number is even")
else:
    print("Number is odd")

# map the inputs to the function blocks.(for switch case use Distonaries)
options = {0 : 0,
           1 : 1,
           4 : 4,
           9 : 9,
           2 : 2,
           3 : 3,
           5 : 5,
           7 : 7,
           }
var1 = 1
print(type(var1))