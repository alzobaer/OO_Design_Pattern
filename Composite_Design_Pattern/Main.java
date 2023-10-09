public class Main {
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
}
