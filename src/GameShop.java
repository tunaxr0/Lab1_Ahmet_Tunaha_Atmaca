import game.inventory.Item;
import game.inventory.Inventory;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // Create 3 Item objects and add them to the inventory
        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        // Call displayAll()
        shop.displayAll();

        System.out.println();

        // Sell some copies:
        item1.sell(4);
        item2.sell(6);

        System.out.println();

        // Call displayAll() again to show updated stock
        shop.displayAll();

        System.out.println();

        // Call auditSerialCodes()
        shop.auditSerialCodes();

    }
}