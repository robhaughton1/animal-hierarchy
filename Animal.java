interface Actions {
    public void speak();
    public void eat();
}

public abstract class Animal implements Actions {
    protected String name;
    protected double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract String getName();
    public abstract double getWeight();
}
