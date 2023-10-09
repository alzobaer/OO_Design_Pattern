# Composite Design Pattern Example in Java

This Java program demonstrates the Composite Design Pattern using an example of a building composed of generic housing structures.

## Description

The Composite Design Pattern is a structural pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. In this example, we have the following key components:

- **HousingStructure** (Component): An interface that defines the common operations for both leaf and composite objects.

- **Apartment** and **House** (Leaf): Concrete classes representing individual housing structures. They implement the **HousingStructure** interface and represent the leaf nodes in the composite structure.

- **Building** (Composite): A concrete class representing a building that can contain a collection of **HousingStructure** objects, including other buildings. It also implements the **HousingStructure** interface and represents the composite nodes in the structure.

## Usage

In the **CompositePatternDemo** class:

1. We create instances of leaf objects (**Apartment** and **House**) to represent individual housing structures.

2. We create a composite building (**Building**) and add apartments (**Apartment**) to it.

3. We create another composite building (**complex**) and add the previously created building (**building**), along with houses (**House**) to it.

4. We then display the structure of the complex, which prints out the hierarchy of housing structures.

## How to Run

You can run the **CompositePatternDemo** class to see the Composite Design Pattern in action. It demonstrates how you can create complex structures of housing units within buildings.

```java
public static void main(String[] args) {
    // Create leaf objects
    HousingStructure apt1 = new Apartment("Apartment 1");
    HousingStructure apt2 = new Apartment("Apartment 2");
    HousingStructure house1 = new House("House 1");
    HousingStructure house2 = new House("House 2");

    // Create a composite building
    Building building = new Building("Luxury Building");
    building.addStructure(apt1);
    building.addStructure(apt2);

    Building complex = new Building("Residential Complex");
    complex.addStructure(building);
    complex.addStructure(house1);
    complex.addStructure(house2);

    // Display the structure of the complex
    complex.displayStructure();
}
```

## UML Class Diagram of Composite Design Pattern
![Composite Design Pattern UML Class Diagram](../images/Composite.png.drawio.png)
