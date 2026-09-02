public class Cat extends Animal {
    private double reflexTime;

    public Cat(String name, double weight, double reflexTime) {
        super(name, weight);
        this.reflexTime = reflexTime;
    }

    public double getReflex() {
        return reflexTime;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void speak() {
        System.out.println("Cat says meow!");
    }

    public void eat() {
        System.out.println("Cat eats cat food.");
    }
}
