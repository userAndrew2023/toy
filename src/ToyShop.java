import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyShop {
    private final List<Toy> toys;

    public ToyShop() {
        this.toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateWeight(int toyId, double newWeight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(newWeight);
                return;
            }
        }
        System.out.println("Игрушка с id " + toyId + " не найдена.");
    }

    public Toy drawToy() {
        double totalWeight = toys.stream().mapToDouble(Toy::getWeight).sum();
        double randomWeight = new Random().nextDouble() * totalWeight;

        double weightSum = 0;
        for (Toy toy : toys) {
            weightSum += toy.getWeight();
            if (randomWeight < weightSum) {
                toy.setQuantity(toy.getQuantity() - 1);
                return toy;
            }
        }
        return null;
    }
}
