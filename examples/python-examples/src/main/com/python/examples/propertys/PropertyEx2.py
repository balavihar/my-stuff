
class Celsius:
    def __init__(self, temperature = 0):
        self.temperature = temperature

    def to_fahrenheit(self):
        return (self.temperature * 1.8) + 32

    def get_temperature(self):
        print("Getting value")
        return self._temperature

    def set_temperature(self, value):
        if value < -273:
            raise ValueError("Temperature below -273 is not possible")
        print("Setting value")
        self._temperature = value

    temperature = property(get_temperature,set_temperature)

# temperature = property()
# assign fget
# temperature = temperature.getter(get_temperature)
# assign fset
# temperature = temperature.setter(5)

# print(temperature.get_temperature)
obj = Celsius()
obj.set_temperature(-86)
print(obj.temperature)