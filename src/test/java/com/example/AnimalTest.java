package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Test
    public void whenGetFamilyThanReturnCorrectString() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void whenGetFoodPredatorsThanMeat() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void whenGetFoodHerbivoreThanPlants() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
    }

    @Test
    public void whenGetFoodUnknownThanTrowsError(){
        Assert.assertThrows(Exception.class, () -> new Animal().getFood("test"));

    }
}