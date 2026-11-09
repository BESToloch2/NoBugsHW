package complexTasks.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class InventoryService {

   private final Map<String, List<Product>> products;


   private boolean isInventoryOpen;

   public void setInventoryOpen(boolean condition){
       isInventoryOpen = condition;
   }

   public InventoryService(){
       products = new HashMap<>();
       isInventoryOpen = true;
   }

   public Map<String, List<Product>> getProducts(){
       return Map.copyOf(products);
   }

   public void addProduct(String category, Product product){

       if (isInventoryOpen) {

           if (products.containsKey(category)) {
               products.get(category).add(product);
           }else {
               List<Product> values = new ArrayList<>();
               values.add(product);
               products.put(category, values);
           }
       }
   }

   public void retrieveProduct (String name, String category){

       if (products.containsKey(category)){

          Product p = products.get(category).stream().filter(v -> v.getName().equals(name)).findFirst().orElse(null);
           List<Product> list = products.get(category);
          if (p != null) {
              list.remove(p);
          }else {
              throw new OutOfStockException("No Such Product");
          }

       }else {
           throw new OutOfStockException("No Such Category");
       }
   }

   public List<Product> filterByCategory(String category) {
       if (!products.containsKey(category)){
           throw new OutOfStockException("No Such Category");
       }

       if (products.get(category).isEmpty()){
           throw new OutOfStockException("Category is empty");
       }
       return List.copyOf(products.get(category));
   }

   public List<Product> filterByPrice(String category, Predicate<Product> condition){
       if (!products.containsKey(category)){
           throw new OutOfStockException("No Such Category");
       }

       if (products.get(category).isEmpty()){
           throw new OutOfStockException("Category is empty");
       }

       return products.get(category).stream().filter(condition).toList();
   }







}
