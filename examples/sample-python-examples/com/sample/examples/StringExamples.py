print("test hello".isspace())
print("".isspace())

s = "my first example"

s1 = s.capitalize()
s2 = s.title()
print(s, id(s))
print(s1, id(s1))
print(s2, id(s2))
print(s[0])
print(s[15])

slice_obj = slice(9,16,1)
print(slice_obj)
s[slice_obj]
print(s[slice_obj])

# Reverse a string in different approaches
print(s.title(), " : reverse : ", s.title()[::-1]) # best approach
print(s.title(), " : reverse : ", "".join(reversed(s.title())))
# Another best approach
start = stop = None
step = -1
reverse_slice = slice(start, stop, step)
print('foo'[reverse_slice])

new_str = str("Hello")
new_str1 = str("Hello")
print("Same id for both ref objs: ", id(new_str), id(new_str1))

str1 = ""
print(type(str1))
print(" ".join(value) for value in (1,2,3,4,5,6))
test_var = (" ".join(value) for value in (1,2,3,4,5,6))
print(type(test_var))
print(test_var)