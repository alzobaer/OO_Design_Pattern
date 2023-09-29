public class Cat extends Animal{
    String color;

    public Cat(int id, String name, int age){
        super(id, name, age);
    }

    public void makeSound(){
        System.out.println("Cat sound: Meow..");
    }
}
