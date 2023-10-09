// Leaf
class House implements HousingStructure {
    private String name;

    public House(String name) {
        this.name = name;
    }

    @Override
    public void displayStructure() {
        System.out.println("House: " + name);
    }
}