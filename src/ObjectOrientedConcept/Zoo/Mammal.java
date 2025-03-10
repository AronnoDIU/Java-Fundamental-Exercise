package ObjectOrientedConcept.Zoo;

public class Mammal extends Animal {
    private final boolean hasFur;

    public Mammal(String name, String species, boolean hasFur) {
        super(name, species);
        this.hasFur = hasFur;
    }

    public boolean hasFur() {
        return hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }

    @Override
    public String toString() {
        return "Mammal [hasFur=" + hasFur + ", " + super.toString() + "]";
    }
}
