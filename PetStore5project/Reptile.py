import Animal as A
import string

class Reptile(A.Animal):
    coldBlooded: bool
    food : string

    # constructor
    def __init__(self):
        A.Animal.__init__(self)
        self.coldBlooded = True
        self.food = "Live"
        self.TYPE = "Reptile"

    # Getter/Setter
    def isColdBlooded(self): return self.coldBlooded
    def getFood(self): return self.food
    def setFood(self,food): self.food = food



if __name__ == "__main__":
    reptile = Reptile()
    reptile.inventory.setLocation("Store #14")
    reptile.inventory.setQuantity(20)
    reptile.inventory.setPrice(12.20)
    reptile.setFood("Ants")
    print("Type : ", reptile.TYPE)
    print('ColdBlooded', reptile.isColdBlooded())
    print('Food', reptile.getFood())
    print('animal')
    print('MultiCellular', reptile.isMultiCellular())
    print('SexualReproduction', reptile.hasSexualReproduction())
    print('Heterotroph', reptile.isHeterotroph())
    print('Inventory')
    print('Location', reptile.inventory.getLocation())
    print('Quantity', reptile.inventory.getQuantity())
    print('Price', reptile.inventory.getPrice())
