package ObjectOrientedConcept.Zoo;

public record ZooKeeper(String name, String id) {

    @Override
    public String toString() {
        return "ZooKeeper [name=" + name + ", id=" + id + "]";
    }
}
