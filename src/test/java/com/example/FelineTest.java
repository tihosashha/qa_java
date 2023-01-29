package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void whenGetMeatThanReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
    @Test
    public void whenGetFamilyThanReturnFeline() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void whenGetKittensNoArgsThanReturnOne() {
        Feline feline = new Feline();
        Assert.assertEquals(1,feline.getKittens());
    }
    @Test
    public void whenGetKittensManyThanReturnMany() {
        Feline feline = new Feline();
        Assert.assertEquals(10,feline.getKittens(10));
    }

}