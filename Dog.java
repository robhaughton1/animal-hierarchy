public class Dog extends Animal {
    private double smellRadius;

    public Dog(String name, double weight, double smellRadius) {
        super(name, weight);
        this.smellRadius = smellRadius;
    }

    public double getRadius() {
        return smellRadius;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void speak() {
        System.out.println("Dog says woof!");
    }

    public void eat() {
        System.out.println("Dog eats dog food.");
    }
}
