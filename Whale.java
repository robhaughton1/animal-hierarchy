public class Whale extends Animal {
    private double size;

    public Whale(String name, double weight, double size) {
        super(name, weight);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void speak() {
        System.out.println("Whales make deep bellows.");
    }

    public void eat() {
        System.out.println("Whales eat krill.");
    }
}
