package ObjectOrientedConcept.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private final String name;
    private final List<Animal> animals = new ArrayList<>();

    public Enclosure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    @Override
    public String toString() {
        return "Enclosure [name=" + name + ", animals=" + animals + "]";
    }
}
