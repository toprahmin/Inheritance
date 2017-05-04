/**
 * Created by rahmirford on 5/3/17.
 */
public class Manager {
    public static void main(String[] args){
        Inventory inv = new Inventory();

        Product broccoli = new Product("Broccoli", 2.49, 16);
        Product potatoes = new Product("Potatoes", 1.29, 50);
        Product corn = new Product("Corn", .99, 127);
        Product mangoes = new Product("Mangoes", 1.79, 31);
        Product oranges = new Product("Oranges", .79, 59);
        Product pineapples = new Product("pineapples", 5.99, 32);

        inv.addToInventory(broccoli);
        inv.addToInventory(pineapples);
        inv.addToInventory(potatoes);
        inv.addToInventory(corn);
        inv.addToInventory(mangoes);
        inv.addToInventory(oranges);


        System.out.println("$ " + inv.getTotalInventoryValue());
        System.out.println(inv.getTotalProductQuantity());
        System.out.println("There are " + inv.countInventory() + " items in our inventory");
        System.out.println(inv.showInventory());

        System.out.println(inv.listOfProducts.size());
        System.out.println(inv.getInventoryValue(inv.listOfProducts));

        }
    }

