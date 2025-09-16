class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price (per unit): Rs. " + price);
    }
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTest {
    public static void main(String[] args) {
        Item item1 = new Item(1011, "Notebook", 50.0);

        System.out.println("Item 1 Details:");
        item1.displayDetails();
        System.out.println("Total cost for 5 units: Rs. " + item1.calculateTotalCost(5));
        System.out.println("-----------------------------------");

    }
}
