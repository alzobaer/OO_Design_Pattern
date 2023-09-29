// java code for Multiple Inheritance using interface
interface Father{           // abstract class => interface
    public abstract void call();
}

interface Mother{
    public abstract void sms();
}

class Son implements Father, Mother{
    @Override
    public void call(){
        System.out.println("calling.. from father");
    }
    @Override
    public void sms(){
        System.out.println("message.. from mother");
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {
        Son obj = new Son();

        obj.call();
        obj.sms();
    }
}