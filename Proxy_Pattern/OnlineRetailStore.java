import java.util.HashMap;

// Subject interface
interface Warehouse {
    void shipProduct(String product, String destination);
}

// RealSubject class
class RealWarehouse implements Warehouse {
    private HashMap<String, Integer> inventory;

    public RealWarehouse() {
        inventory = new HashMap<>();
        // Initialize inventory
        inventory.put("ProductA", 100);
        inventory.put("ProductB", 50);
        inventory.put("ProductC", 75);
    }

    @Override
    public void shipProduct(String product, String destination) {
        if (inventory.containsKey(product) && inventory.get(product) > 0) {
            // Simulate shipping process
            System.out.println("Shipping " + product + " to " + destination);
            inventory.put(product, inventory.get(product) - 1);
        } else {
            System.out.println(product + " is out of stock.");
        }
    }
}

// Proxy class
class WarehouseProxy implements Warehouse {
    private RealWarehouse realWarehouse;

    public WarehouseProxy() {
        // The real warehouse is created only when needed
        realWarehouse = null;
    }

    private void initializeRealWarehouse() {
        if (realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }
    }

    @Override
    public void shipProduct(String product, String destination) {
        initializeRealWarehouse();
        realWarehouse.shipProduct(product, destination);
    }
}

public class OnlineRetailStore {
    public static void main(String[] args) {
        // Create a proxy for the warehouse
        Warehouse warehouse = new WarehouseProxy();

        // Place orders from different locations
        warehouse.shipProduct("ProductA", "New York");
        warehouse.shipProduct("ProductB", "London");
        warehouse.shipProduct("ProductC", "Sydney");
        warehouse.shipProduct("ProductD", "Tokyo"); // ProductD is out of stock

        // This time, it will use the same real warehouse instance
        warehouse.shipProduct("ProductA", "Los Angeles");
    }
}
