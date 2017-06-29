class Celsius:
    def __init__(self, temperature = 0):
        self.temperature = temperature
    def to_fahrenheit(self):
        return (self.temperature * 1.8) + 32

man = Celsius()
man.temperature = 22
man.test = 11
print(man.temperature)
print(1.1 + 2.2)
print(man.__dict__)
