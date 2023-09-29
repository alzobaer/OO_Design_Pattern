public class Dog extends Animal{
    
    int weight;

    public Dog(int id, String name, int age){
        super(id, name, age);
    }

    public void makeSound(){
        System.out.println("Sound: Bark..\n");
    }
}
