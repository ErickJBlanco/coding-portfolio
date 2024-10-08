import Reptile as R
import string

class Snake(R.Reptile):
    constrictor : bool
    color : string
    size : string
    weight: float

    def __init__(self, name = 'Snake',  size ='S', weight = 1.0):
        R.Reptile.__init__(self)
        self.constrictor = True
        self.color = 'Black'
        self.TYPE = "Snake"
        self.setName(name)
        self.size = size
        self.weight = weight

    def isConstrictor(self): return self.constrictor
    def setConstrictor(self, constrictor): self.constrictor = constrictor
    def getColor(self): return self.color
    def setColor(self, color): self.color = color


    def getSize(self): return self.size

    def getWeight(self): return self.weight


    def setSize(self, size): self.size = size

    def setWeight(self, weight): self.weight = weight


if __name__ == "__main__":
    snake = Snake()
    snake.setColor('White')
    print('Type',snake.TYPE)
    print("Constrictor",snake.isConstrictor())
    print("Color",snake.getColor())

    snake.inventory.setLocation("Store #14")
    snake.inventory.setQuantity(20)
    snake.inventory.setPrice(12.20)

    print('ColdBlooded', snake.isColdBlooded())
    print('Food', snake.getFood())
    print('animal')
    print('MultiCellular', snake.isMultiCellular())
    print('SexualReproduction', snake.hasSexualReproduction())
    print('Heterotroph', snake.isHeterotroph())
    print('Inventory')
    print('Location', snake.inventory.getLocation())
    print('Quantity', snake.inventory.getQuantity())
    print('Price', snake.inventory.getPrice())
