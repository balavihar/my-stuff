# Note: You may get different value of id

a = 2
# Output: id(2)= 10919424
print('id(2) =', id(2))

# Output: id(a) = 10919424
print('id(a) =', id(a))

b = 2
print('id(2) =', id(2))
print('id(b) =', id(b))
a = 1
print('id(a) =', id(a))
print('id(1) =', id(1))
print('------')
# Note: You may get different value of id

a = 2

# Output: id(a) = 10919424
# Output: id(a) = 10919424
print('id(a) =', id(a))

a = a+1

# Output: id(a) = 10919456
print('id(a) =', id(a))

# Output: id(3) = 10919456
print('id(3) =', id(3))

b = 2

# Output: id(2)= 10919424
print('id(2) =', id(2))