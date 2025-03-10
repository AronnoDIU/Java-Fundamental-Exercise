package ObjectOrientedConcept.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal lion = new Mammal("Leo", "Lion", true);
        Animal eagle = new Bird("Eddie", "Eagle", true);

        ZooKeeper zooKeeper1 = new ZooKeeper("Alice", "ZK001");
        ZooKeeper zooKeeper2 = new ZooKeeper("Bob", "ZK002");

        Enclosure mammalEnclosure = new Enclosure("Mammal Enclosure");
        Enclosure birdEnclosure = new Enclosure("Bird Enclosure");

        mammalEnclosure.addAnimal(lion);
        birdEnclosure.addAnimal(eagle);

        zoo.addEnclosure(mammalEnclosure);
        zoo.addEnclosure(birdEnclosure);
        zoo.addZooKeeper(zooKeeper1);
        zoo.addZooKeeper(zooKeeper2);

        System.out.println(zoo);

        lion.makeSound();
        eagle.makeSound();
    }
}
