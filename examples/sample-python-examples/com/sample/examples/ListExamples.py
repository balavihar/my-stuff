myList = [4,2,6,3,5,1]

print(len(myList))
print(3 in myList)
print(3 not in myList)
print(max(myList))
print(myList[2::+1])
print(myList[0:3:+1])
print(myList[3])
print(myList[5])

slice_obj = slice(0, 3, +1)
print(myList[slice_obj])

my_sub_list = myList[slice_obj]
print(my_sub_list)

print("Ids : ", id(myList), id(my_sub_list))

print(my_sub_list[:2])
print(myList[4:])
print(myList[2:6])

print(1 in my_sub_list)
print(2 in myList)
for value in myList:
    print (value)
    #print(value, end="\n")

print("\n",sorted(myList),)
print(myList.sort())
list(myList).pop()
print(myList.pop())
print(myList)
myStrList=list("HelloWorld")
print(myStrList[5])


# How to use Dictionaries
mobile_nos={"vihar":11221122, "mob":22112211}

print(mobile_nos)
print(mobile_nos["vihar"])
mobile_nos["nice"] = 33443344
print(mobile_nos)
mobile_nos["temp-no"]=11111111
print(mobile_nos)
del mobile_nos["temp-no"]
mobile_nos.pop("nice")
print(mobile_nos)

# How to use Tuples : these are immutable
my_tuple = tuple("HelloTuple")
print(my_tuple)
print(my_tuple[5:8])

