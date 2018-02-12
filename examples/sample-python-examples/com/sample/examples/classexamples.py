
"""
class __TestPrivateClass:
    def test2(self, name):
        self.name = name

pc = __TestPrivateClass()
pc.test2("from private vihar")
print(pc.name)


class MyFirstClass:

    def test1(self, myname):
        self.myname = myname
        #pc = __TestPrivateClass()

a = MyFirstClass()
a.test1("Rob")

print(a.myname)
"""
class __ABCPrivateClass:
    def abd(self, name):
        self.name = name

print("hello")
