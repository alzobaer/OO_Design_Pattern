// Leaf
class Apartment implements HousingStructure {
    private String name;

    public Apartment(String name) {
        this.name = name;
    }

    @Override
    public void displayStructure() {
        System.out.println("Apartment: " + name);
    }
}