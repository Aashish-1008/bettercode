package dpatterns.behaviour.iterator.model;


public class Item {
    private int itemId;

    public Item(int itemId, String itemname) {
        this.itemId = itemId;
        this.itemname = itemname;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    private String itemname;
}
