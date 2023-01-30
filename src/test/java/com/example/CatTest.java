package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CatTest {
    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenGetSoundThanReturnMeow() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void whenGetFoodThanCallEatMeat() throws Exception {
        Cat cat = new Cat(feline);

        cat.getFood();

        Mockito.verify(feline).eatMeat();
    }
}