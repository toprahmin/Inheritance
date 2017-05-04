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

        inv.addToInventory(broccoli);
        inv.addProductQuantity(broccoli);
        inv.addProductValue(broccoli);

        inv.addToInventory(potatoes);
        inv.addProductQuantity(potatoes);
        inv.addProductValue(potatoes);

        inv.addToInventory(corn);
        inv.addProductQuantity(corn);
        inv.addProductValue(corn);

        inv.addToInventory(mangoes);
        inv.addProductQuantity(mangoes);
        inv.addProductValue(mangoes);

        inv.addToInventory(oranges);
        inv.addProductQuantity(oranges);
        inv.addProductValue(oranges);

        System.out.println("$ " + inv.getTotalInventoryValue());
        System.out.println(inv.getTotalProductQuantity());


        }
    }

