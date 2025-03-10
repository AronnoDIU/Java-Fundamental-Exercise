package ObjectOrientedConcept.Zoo;

public class Bird extends Animal {
    private final boolean canFly;

    public Bird(String name, String species, boolean canFly) {
        super(name, species);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound");
    }

    @Override
    public String toString() {
        return "Bird [canFly=" + canFly + ", " + super.toString() + "]";
    }
}
