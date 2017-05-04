/**
 * Created by rahmirford on 5/3/17.
 */
public class App {

    public static void main(String[] args) {
        Inventory inv = new Inventory();

        Product broccoli = new Product("Broccoli", 2.49, 16);
        Product potatoes = new Product("Potatoes", 1.29, 50);
        Product corn = new Product("Corn", .99, 127);
        Product mangoes = new Product("Mangoes", 1.79, 31);
        Product oranges = new Product("Oranges", .79, 59);

        inv.addProduct(broccoli);
        inv.addProduct(potatoes);
        inv.addProduct(corn);
        inv.addProduct(mangoes);
        inv.addProduct(oranges);
    }
}
