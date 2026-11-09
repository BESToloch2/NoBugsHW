package complexTasks.task5;

public class Product {
    private final String name;
    private final double price;
    private final String category;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
