# Java Animal Hierarchy

A Java practice project focused on object-oriented programming concepts including inheritance, abstract classes, interfaces, polymorphism, casting, and ArrayLists.

## What the project does

The program creates several animal subclasses (`Dog`, `Cat`, and `Whale`) that inherit shared data from an abstract `Animal` class. Each animal has its own subclass-specific property while also implementing shared actions through an interface.

The animals are stored together in an `ArrayList<Animal>`. The program loops through the list, prints shared information such as name and weight, checks each object's subclass with `instanceof`, then casts the object so its subclass-specific value can be accessed.

## Concepts practiced

- Classes and objects
- Constructors and constructor parameters
- Inheritance with `extends`
- Parent constructors with `super()`
- Abstract classes and abstract methods
- Interfaces with `implements`
- Protected and private fields
- Getters
- `ArrayList<Animal>`
- Indexed loops and `.get(index)`
- `instanceof`
- Downcasting

## Files

- `Main.java` - creates the animals, stores them in an ArrayList, and processes the list
- `Animal.java` - contains the `Actions` interface and abstract `Animal` class
- `Dog.java` - Dog subclass
- `Cat.java` - Cat subclass
- `Whale.java` - Whale subclass

## Purpose

This project was built as Java OOP practice and represents my progress learning how inheritance, collections, and subclass-specific behavior work together in one program.
