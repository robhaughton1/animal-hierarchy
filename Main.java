import java.util.ArrayList;

void main() {
    ArrayList<Animal> animalList = new ArrayList<>();
    Animal dog = new Dog("Buttercup", 40, 10);
    Animal cat = new Cat("Felix", 20, 0.1);
    Animal whale = new Whale("Samuel", 6000, 100);

    animalList.add(dog);
    animalList.add(cat);
    animalList.add(whale);

    int index;
    for (index = 0; index < animalList.size(); index++) {
        Animal current = animalList.get(index);

        System.out.println(animalList.get(index).getName());
        System.out.println(animalList.get(index).getWeight());

        if (animalList.get(index) instanceof Dog) {
            System.out.println(((Dog) current).getRadius());
        } else if (animalList.get(index) instanceof Cat) {
            System.out.println(((Cat) current).getReflex());
        } else if (animalList.get(index) instanceof Whale) {
            System.out.println(((Whale) current).getSize());
        }
    }
}
