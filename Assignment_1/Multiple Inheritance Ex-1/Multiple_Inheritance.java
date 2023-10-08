interface AnimalEat {
    public abstract void eat();
}

interface AnimalMove {
    public abstract void move();
}

interface AnimalSleep {
    public abstract void sleep();
}
    
class Animal implements AnimalEat, AnimalMove, AnimalSleep{
    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
    @Override
    public void move() {
        System.out.println("Animal is moving");
    }
    @Override
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

public class Multiple_Inheritance {
        public static void main(String args[]) {
        Animal a = new Animal();
        a.eat();
        a.move();
        a.sleep();
    }
}


