
class __TestPrivateClass:
    def test(self, name):
        self.name = name

pc = __TestPrivateClass()
pc.test("from private vihar")
print(pc.name)


class MyFirstClass:

    def test(self, myname):
        self.myname = myname
        #pc = __TestPrivateClass()

a = MyFirstClass()
a.test("Rob")

print(a.myname)
