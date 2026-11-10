package complexTasks.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
/*
Протестируйте добавление
и извлечение товаров
проверив работу флага isInventoryOpen,
фильтрацию по категории и цене,
обработку исключений при отсутствии товаров.*/


    InventoryService inventoryService;
    Product product1;
    Product product2;
    Product product3;
    String electronics;
    String food;
    Map<String, List<Product>> collection;

    @BeforeEach
    public void setup(){
        inventoryService = new InventoryService();

        electronics = "Electronics";
        food = "Food";

        product1 = new Product("iPhone", "Electronics", 1200.0);
        product2 = new Product("Samsung", "Electronics", 1000);
        product3 = new Product("Apple", "Food", 3.9);

    }

    @Test
    public void managerCannotAddProductWhenInventoryIsClosed(){
        inventoryService.setInventoryOpen(false);
        InventoryClosedException exception = assertThrows(InventoryClosedException.class, () -> inventoryService.addProduct(electronics, product1));
        assertEquals("You can`t add product when inventory is closed", exception.getMessage());
    }

    @Test
    public void managerCannotRetrieveProductWhenInventoryIsClosed(){
        inventoryService.addProduct(food, product3);
        inventoryService.setInventoryOpen(false);
        InventoryClosedException exception = assertThrows(InventoryClosedException.class, () -> inventoryService.retrieveProduct(food, product3.getName()));
        assertEquals("You can`t retrieve product when inventory is closed", exception.getMessage());
        assertEquals(1, inventoryService.getProducts().get(food).size());
    }

    @Test
    public void managerCanAddNewCategoryAndProduct(){
        inventoryService.addProduct(electronics, product1);

        collection = inventoryService.getProducts();

        assertTrue(collection.containsKey(electronics));
        assertTrue(collection.get(electronics).contains(product1));
    }

    @Test
    public void managerCanAddNewProductIntoExistedCategory(){
        inventoryService.addProduct(electronics, product1);
        inventoryService.addProduct(electronics, product2);

        collection = inventoryService.getProducts();

        List<Product> list = collection.get(electronics);

        assertEquals(1, collection.size());
        assertEquals(2, list.size());
        assertTrue(list.contains(product1) && list.contains(product2));
    }

    @Test
    public void managerCanRetrieveProductFromInventory(){
        inventoryService.addProduct(electronics, product1);
        inventoryService.addProduct(electronics, product2);
        inventoryService.addProduct(food, product3);
        inventoryService.retrieveProduct(product3.getName(), food);
        assertFalse(inventoryService.getProducts().get(food).contains(product3));
        assertEquals(2, inventoryService.getProducts().get(electronics).size());
    }

    @Test
    public void managerCanFilterProductsByCategory(){
        inventoryService.addProduct(electronics, product1);
        inventoryService.addProduct(electronics, product2);
        inventoryService.addProduct(food, product3);

        List<Product> expected = List.of(product3);

        assertEquals(expected, inventoryService.filterByCategory(food));
    }

    @Test
    public void managerCanFilterProductsByPrice(){
        inventoryService.addProduct(electronics, product1);
        inventoryService.addProduct(electronics, product2);
        inventoryService.addProduct(food, product3);
        List<Product> expected = List.of(product2);
        assertEquals(expected, inventoryService.filterByPrice(electronics, p -> p.getPrice() < 1200.0));
    }

    @Test
    public void managerCatchExceptionWhenTryingToRetrieveProductFromNotExistedCategory(){
        OutOfStockException exception = assertThrows(OutOfStockException.class, () -> inventoryService.retrieveProduct(food, product3.getName()));
        assertEquals("No Such Category", exception.getMessage());
    }

    @Test
    public void managerCatchExceptionWhenTryingToRetrieveNotExistedProduct(){
        inventoryService.addProduct(electronics, product1);
        OutOfStockException exception = assertThrows(OutOfStockException.class, () -> inventoryService.retrieveProduct(electronics, "Nonexistent Product"));
        assertEquals("No Such Product", exception.getMessage());
    }
}
