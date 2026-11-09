package complexTasks.task5;

public class InventoryServiceTest {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        inventoryService.filterByPrice("Electronics", p -> p.getPrice() < 100.0);
    }

}
