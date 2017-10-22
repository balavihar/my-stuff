a = [1,2,3]             # first we give some names to some stuff,
b = [4,5,6]             #     thus making it accessible in this scope and enclosing scopes
c = [8,9,10]

def do_things():
    a = "new a"
    b.append(7)
    c = "new c"
    print (a)
    print (b)
    print (c)

do_things()            #nothing surprising in the output...

print (a)                # [1,2,3]
print (b)                # [4, 5, 6, 7]
print (c)