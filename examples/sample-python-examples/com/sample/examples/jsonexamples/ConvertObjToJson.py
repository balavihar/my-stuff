import json


class Employee:
    def __init__(self):
        self._ename = None
        self._hno = None
        self.test_ename = None

    @property
    def get_ename(self):
        return self._ename
    def ename(self, ename):
        self._ename = ename
    @property
    def get_hno(self):
        return self._hno
    def hno(self, hno):
        self._hno = hno

class EmployeeAddres:
    def __init__(self, house_no):
        self.house_no = house_no

def jsonDefault(object):
    return object.__dict__

if __name__ == '__main__':
    a = Employee()
    a.ename("vihar")
    a.test_ename = "safsadfsf"
    a.hno("H-No 1-8,Hyd,502319.")
    print(a.get_ename)
    ejson = json.dumps(a, default=jsonDefault)
    print(ejson)
    a.ename([1,2,3])
    print(a.get_ename)
    a.test_ename = []
    ejson = json.dumps(a, default=jsonDefault)
    print(ejson)

