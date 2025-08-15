package capgemini.generics;

public class ItemInventory<I,C> {

    I itemName;
    C itemCount;

    public I getItemName() {
        return itemName;
    }

    public void setItemName(I itemName) {
        this.itemName = itemName;
    }

    public C getItemCount() {
        return itemCount;
    }

    public void setItemCount(C itemCount) {
        this.itemCount = itemCount;
    }
}
