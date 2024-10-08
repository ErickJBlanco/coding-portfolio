import Inventory as Inv
import string
class Animal:
    multiCellular : bool
    sexualReproduction : bool
    heterotroph : bool
    backbone: bool
    fourLimbs: bool
    inventory: Inv.Inventory
    type: string
    name : string
    def __init__(self):
        self.multiCellular = True
        self.heterotroph = True
        self.sexualReproduction = True
        self.inventory = Inv.Inventory()
        self.backbone = True
        self.fourLimbs = True
        self.TYPE = "Animal"
        self.name = None

    def setName(self, name): self.name = name
    def getName(self): return self.name
    def isMultiCellular(self): return self.multiCellular
    def hasSexualReproduction(self): return self.sexualReproduction
    def isHeterotroph(self): return self.heterotroph
    def hasBackbone(self): return self.backbone
    def hasFourLimbs(self): return self.fourLimbs
    def setFourLimbs(self, fourLimbs): self.fourLimbs = fourLimbs

if __name__ == "__main__":
    animal = Animal()
    print('type', animal.TYPE)
    print('MultiCellular',animal.isMultiCellular())
    print('SexualReproduction',animal.hasSexualReproduction())
    print('Heterotroph',animal.isHeterotroph())
    print('Inventory')
    print('Location', animal.inventory.getLocation())
    print('Quantity', animal.inventory.getQuantity())
    print('Price', animal.inventory.getPrice())
