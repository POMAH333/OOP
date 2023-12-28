from Domain.product import Product

class Hot_Drink(Product):
    def __init__(self, price, place, name, id):
        super().__init__(price, place, name, id)
        self.temp = 70

    def __init__(self, price, place, name, id, temp):
        super().__init__(price, place, name, id)
        self.temp = temp

    def getBottleVolume(self):
        return self.temp

    def setBottleVolume(self, temp):
        self.temp = temp

    def __str__(self):
        return super().__str__() + "\ntemperature=" + str(self.temp)