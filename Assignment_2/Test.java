public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog(0,null, 0);
        Animal cat = new Cat(201, "Mini", 5);

        // print dog ID
        dog.setId(101);
        System.out.println("Dog id: " + dog.getId());
        //print dog name
        dog.setName("Buddy");
        System.out.println("Dog name: " + dog.getName());
        // print dog age
        dog.setAge(15);
        System.out.println("Dog age: " + dog.getAge());
        // print dog weight
        Dog d = new Dog(0, null, 0);
        d.weight = 18;
        System.out.println("Dog weight: " + d.weight);
        // print dog sound
        dog.makeSound();
        

        // print cat id
        System.out.println("cat id: " + cat.getId());
        // print cat name
        System.out.println("cat name: " + cat.getName());
        //print cat age
        System.out.println("cat age: " + cat.getAge());
        // print cat color 
        Cat c = new Cat(0, null, 0);
        c.color = "White";
        System.out.println("cat color: " + c.color);
        // print cat sound
        cat.makeSound();
    }
}
