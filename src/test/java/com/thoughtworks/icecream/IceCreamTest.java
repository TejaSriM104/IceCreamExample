package com.thoughtworks.icecream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IceCreamTest {

    @Test
    public void shouldReturnHundredWhenSimpleIceCreamIsCreated() {
        IceCream iceCream = new SimpleIceCream();

        iceCream.makeIceCream();
        int result = iceCream.totalPrice();

        assertEquals(100, result);
    }

    @Test
    public void shouldReturnHundredAndFiftyWhenDecoratedWithNuts() {
        IceCream iceCream = new NuttyDecorator(new SimpleIceCream());

        iceCream.makeIceCream();
        int result = iceCream.totalPrice();

        assertEquals(150, result);
    }

    @Test
    public void shouldReturnHundredAndNinetyWhenDecoratedWithNutsAndChocolate() {
        IceCream iceCream = new NuttyDecorator(new ChocolateDecorator(new SimpleIceCream()));

        iceCream.makeIceCream();
        int result = iceCream.totalPrice();

        assertEquals(190, result);
    }

    @Test
    public void shouldReturnHundredAndFortyWhenDecoratedWithChocolate() {
        IceCream iceCream = new ChocolateDecorator(new SimpleIceCream());

        iceCream.makeIceCream();
        int result = iceCream.totalPrice();

        assertEquals(140, result);
    }
}
