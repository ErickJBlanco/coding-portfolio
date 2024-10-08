import Animal as A
class Mammal(A.Animal):
    warmBlooded: bool
    fur : bool

    # constructor
    def __init__(self):
        A.Animal.__init__(self)
        self.warmBlooded = True
        self.fur = True
        self.TYPE = "Mammal"

    # Getter/Setter
    def isWarmBlooded(self): return self.warmBlooded
    def setWarmBlooded(self, blooded: bool): self.warmBlooded = blooded
    def hasFur(self): return self.fur
    def setFur(self, fur: bool): self.fur = fur


if __name__ == "__main__":
    mammal = Mammal()
    mammal.inventory.setLocation("Store #14")
    mammal.inventory.setQuantity(20)
    mammal.inventory.setPrice(12.20)
    print("Type : ", mammal.TYPE)
    print('WarmBlooded', mammal.isWarmBlooded())
    print('Fur', mammal.hasFur())
    print('animal')
    print('MultiCellular', mammal.isMultiCellular())
    print('SexualReproduction', mammal.hasSexualReproduction())
    print('Heterotroph', mammal.isHeterotroph())
    print('Inventory')
    print('Location', mammal.inventory.getLocation())
    print('Quantity', mammal.inventory.getQuantity())
    print('Price', mammal.inventory.getPrice())
