package org.nstern.demos.dto;

public class Item {

    private ItemType type;
    private String name;
    private String description;
    private int price;

    public static final int BOOK_PRICE_LIMIT = 50;

    public static class ItemBuilder {

        private Item item = new Item();

        public ItemBuilder withType(ItemType t) {
            item.setType(t);
            return this;
        }

        public ItemBuilder withName(String s) {
            item.setName(s);
            return this;
        }

        public ItemBuilder withDescription(String s) {
            item.setDescription(s);
            return this;
        }

        public ItemBuilder withPrice(int i) {
            item.setPrice(i);
            return this;
        }

        public Item build() {
            return item;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

}
