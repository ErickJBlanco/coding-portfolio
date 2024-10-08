import Reptile as R
import string

class Lizard(R.Reptile):
    habitat : string
    frill : bool
    spikes : bool

    def __init__(self, name = 'Snake',  size ='S', weight = 1.0, color = 'sand orange'):
        R.Reptile.__init__(self)
        self.habitat = "Arid"
        self.frill = False
        self.spikes = False
        self.TYPE = "Lizard"
        self.setName(name)
        self.size = size
        self.weight = weight
        self.color = color
    def hasFrill(self): return self.frill
    def setFrill(self, frill): self.frill = frill
    def getHabitat(self): return self.habitat
    def setHabitat(self, habitat): self.habitat = habitat
    def hasSpikes(self): return self.spikes
    def setSpikes(self, spikes): self.spikes = spikes


    def getSize(self): return self.size

    def getWeight(self): return self.weight


    def setSize(self, size): self.size = size

    def setWeight(self, weight): self.weight = weight

    def setColor(self, color): self.color = color

    def getColor(self): return self.color

if __name__ == "__main__":
    lizard = Lizard()
    lizard.setFrill(True)
    lizard.setHabitat("Forest")
    lizard.setSpikes(False)
    print('Type', lizard.TYPE)
    print("Frill",lizard.hasFrill())
    print("Spikes",lizard.hasSpikes())
    print("Habitat", lizard.getHabitat())
    lizard.inventory.setLocation("Store #14")
    lizard.inventory.setQuantity(20)
    lizard.inventory.setPrice(12.20)

    print('ColdBlooded', lizard.isColdBlooded())
    print('Food', lizard.getFood())
    print('animal')
    print('MultiCellular', lizard.isMultiCellular())
    print('SexualReproduction', lizard.hasSexualReproduction())
    print('Heterotroph', lizard.isHeterotroph())
    print('Inventory')
    print('Location', lizard.inventory.getLocation())
    print('Quantity', lizard.inventory.getQuantity())
    print('Price', lizard.inventory.getPrice())
