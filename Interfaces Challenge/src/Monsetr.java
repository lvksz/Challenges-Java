import java.util.ArrayList;
import java.util.List;

public class Monsetr implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(0,name);
        list.add(1, ""+hitPoints);
        list.add(2, ""+ strength);
        return list;
    }

    @Override
    public void read(List<String> stringList) {
        if (stringList!=null && !stringList.isEmpty()){
            name = stringList.get(0);
            hitPoints = Integer.parseInt(stringList.get(1));
            strength = Integer.parseInt(stringList.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
}
