package org.nstern.demos.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.nstern.demos.dto.Item;
import org.nstern.demos.dto.ItemType;
import org.nstern.demos.exceptions.DemoBusinessException;

class OrElseDemoTest {

    OrElseDemo sut = new OrElseDemo();

    @Test
    void changePrice_should_increment_price(){
        // given
        Item item = new Item.ItemBuilder().withName("test").withPrice(10).build();
        int increment  = 10;

        // when
        Item result = sut.changePrice(item, increment);

        // then
        assertEquals(20, result.getPrice());
    }

    @Test
    void change_should_not_increment_price_above_40_for_books(){
        // given
        Item item = new Item.ItemBuilder().withType(ItemType.BOOK).withName("Some book").withPrice(30).build();
        int increment  = 20;

        // when
        assertThrows(DemoBusinessException.class, ()->sut.changePrice(item, increment));
    }

    @Test
    void changePriceWithOrElse_should_increment_price(){
        // given
        Item item = new Item.ItemBuilder().withName("test").withPrice(10).build();
        int increment  = 10;

        // when
        Item result = sut.changePriceWithOrElse(item, increment);

        // then
        assertEquals(20, result.getPrice());
    }



}