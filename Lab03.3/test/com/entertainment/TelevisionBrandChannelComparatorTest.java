package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionBrandChannelComparatorTest {

    private TelevisionBrandChannelComparator comparator;
    private Television tv1;
    private Television tv2;

    @Before
    public void setUp() {
        comparator = new TelevisionBrandChannelComparator();
        tv1 = new Television("Samsung");
        tv2 = new Television("Samsung");
    }

    @Test
    public void compare_shouldreturnZero_whenSameBrand_sameChannel() {
        assertEquals(0, comparator.compare(tv1, tv2));
    }

    @Test
    public void compare_shouldReturnNegativeNumber_when1stBrandLessThan2ndBrand() {
        tv1.setBrand("A_lessThan");
        tv2.setBrand("B_greaterThan");
        assertTrue(comparator.compare(tv1, tv2) < 0);
    }

    @Test
    public void compare_shouldReturnPositiveNumber_when1stBrandLessThan2ndBrand() {
        tv1.setBrand("B_greaterThan");
        tv2.setBrand("A_lessThan");
        assertTrue(comparator.compare(tv1, tv2) > 0);
    }

    @Test
    public void compare_shouldReturnNegativeNumber_whenSameBrand_1stChanceLessThan2ndChannel() {

    }
}