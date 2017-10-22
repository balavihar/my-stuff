my_list = [1,2,3,4]
print(len(my_list))
for i in my_list:
    print(i)

print("for i in range(0, 10):")
for i in range(0, 10):
    print(i)

print("for i in range(0, 10, 2):")
for i in range(0, 10, 2):
    print(i)

print("for i in range(0, len(my_list)):")
for i in range(0, len(my_list)):
    if(i > 5):
        break
    print(i)

