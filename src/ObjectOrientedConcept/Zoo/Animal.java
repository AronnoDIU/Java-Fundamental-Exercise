package ObjectOrientedConcept.Zoo;

public abstract class Animal {
    private final String name;
    private final String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal [name=" + name + ", species=" + species + "]";
    }
}
