package org.nstern.demos;

import org.nstern.demos.dto.Item;
import org.nstern.demos.dto.ItemType;
import org.nstern.demos.exceptions.DemoBusinessException;

public class OrElseDemo {

    public Item changePrice(Item item, int i) {

        if (ItemType.BOOK.equals(item.getType())) {
            if (item.getPrice() + i < Item.BOOK_PRICE_LIMIT) {
                item.setPrice(item.getPrice() + i);
            } else {
                throw new DemoBusinessException("reached price limit");
            }
        } else {
            item.setPrice(item.getPrice() + i);
        }
        return item;
    }

    public Item changePriceWithOrElse(Item item, int i) {

        item.setPrice(item.getPrice() + i);
        return item;
    }

}
