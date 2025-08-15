package capgemini.generics;

public class InventoryTest {

    public static void main(String[] args) {

        ItemInventory<String,Integer> inventory = new ItemInventory<>();
        inventory.setItemCount(10);
        inventory.setItemName("Coke");

         System.out.println(inventory.getItemName());
    }
}
