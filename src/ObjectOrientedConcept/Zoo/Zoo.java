package ObjectOrientedConcept.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Enclosure> enclosures = new ArrayList<>();
    private final List<ZooKeeper> zooKeepers = new ArrayList<>();

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void addZooKeeper(ZooKeeper zooKeeper) {
        zooKeepers.add(zooKeeper);
    }

    public List<Enclosure> getEnclosures() {
        return new ArrayList<>(enclosures);
    }

    public List<ZooKeeper> getZooKeepers() {
        return new ArrayList<>(zooKeepers);
    }

    @Override
    public String toString() {
        return "Zoo [enclosures=" + enclosures + ", zooKeepers=" + zooKeepers + "]";
    }
}
