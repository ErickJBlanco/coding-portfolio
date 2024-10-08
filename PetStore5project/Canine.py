import Mammal as M
import string

class Canine(M.Mammal):
    size : string
    weight : float
    color : string

    def __init__(self, name ='Dog', size = "S", weight = 1.0):
        M.Mammal.__init__(self)
        self.setName(name)
        self.TYPE = "Canine"
        self.size = size
        self.weight = weight
        self.color = "Gray"


    def getSize(self): return self.size
    def getWeight(self): return self.weight
    def getColor(self): return self.color

    def setSize(self, size ): self.size = size
    def setWeight(self, weight ): self.weight = weight
    def setColor(self, color): self.color = color

    def bark(self,count) :
        for i in range(count):
            print("Woof")

if __name__ == "__main__":
    canine = Canine("Begle", "M", 12.3)
    canine.bark(3)
    print("Name",canine.getName())
    print("Type",canine.TYPE)
    print("Size",canine.getSize())
    print("Weight",canine.getWeight())
    print("Color",canine.getColor())

    canine.inventory.setLocation("Store #14")
    canine.inventory.setQuantity(20)
    canine.inventory.setPrice(12.20)
    print("Type",canine.TYPE)
    print('WarmBlooded', canine.isWarmBlooded())
    print('Fur', canine.hasFur())
    print('animal')
    print('MultiCellular', canine.isMultiCellular())
    print('SexualReproduction', canine.hasSexualReproduction())
    print('Heterotroph', canine.isHeterotroph())
    print('Inventory')
    print('Location', canine.inventory.getLocation())
    print('Quantity', canine.inventory.getQuantity())
    print('Price', canine.inventory.getPrice())
