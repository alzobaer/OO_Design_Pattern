// Investment account class implementing Account interface
public class Investment implements Account {
    @Override
    public void checkBalance() {
        System.out.println("Investment account balance checked.");
    }
}