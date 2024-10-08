import Mammal as M
import Inventory
import string

class Feline(M.Mammal):
    size : string
    weight : float
    color : string

    def __init__(self, name = 'Cat',  size ='S', weight = 1.0):
        M.Mammal.__init__(self)
        self.setName(name)
        self.TYPE = "Feline"
        self.size = size
        self.weight = weight
        self.color = "Gray"


    def getSize(self): return self.size
    def getWeight(self): return self.weight
    def getColor(self): return self.color

    def setSize(self, size ): self.size = size
    def setWeight(self, weight ): self.weight = weight
    def setColor(self, color): self.color = color

    def purr(self,count) :
        for i in range(count):
            print("Meow")

if __name__ == "__main__":
    feline = Feline("Tabby", "S", 12.3)
    feline.purr(2)
    print("Name",feline.getName())
    print("Type",feline.TYPE)
    print("Size",feline.getSize())
    print("Weight",feline.getWeight())
    print("Color",feline.getColor())

    feline.inventory.setLocation("Store #14")
    feline.inventory.setQuantity(20)
    feline.inventory.setPrice(12.20)

    print('WarmBlooded', feline.isWarmBlooded())
    print('Fur', feline.hasFur())
    print('animal')
    print('MultiCellular', feline.isMultiCellular())
    print('SexualReproduction', feline.hasSexualReproduction())
    print('Heterotroph', feline.isHeterotroph())
    print('Inventory')
    print('Location', feline.inventory.getLocation())
    print('Quantity', feline.inventory.getQuantity())
    print('Price', feline.inventory.getPrice())
