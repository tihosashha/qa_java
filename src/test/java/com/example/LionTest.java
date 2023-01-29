package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionTest {

    @Mock
    Feline feline;

    private final String actualSex;
    private final boolean expectedHasMane;

    public LionTest(String actualSex, boolean expectedHasMane) {
        this.actualSex = actualSex;
        this.expectedHasMane = expectedHasMane;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenSexThanAssertHasMane() throws Exception {
        Lion lion = new Lion(actualSex, feline);

        Assert.assertEquals(expectedHasMane, lion.hasMane);
    }

    @Test
    public void whenUnknownSexThanThrowsError() {
        Assert.assertThrows(Exception.class, () -> new Lion("test", feline));
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
}