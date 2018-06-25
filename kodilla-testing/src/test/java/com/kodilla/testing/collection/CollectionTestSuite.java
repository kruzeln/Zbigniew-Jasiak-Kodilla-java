package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void setUp() throws Exception {
        System.out.println("Test case: begin ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test case: end ");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator ext = new OddNumbersExterminator();
        ArrayList<Integer> newList = new ArrayList<Integer>(0);
        ArrayList oddList = ext.exterminate(newList);
        System.out.println("Metoda zwraca listę o wielkości " + oddList.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator ext2 = new OddNumbersExterminator();
        ArrayList<Integer> newList2 = new ArrayList<Integer>(10);
        for (int k = 0; k < 15; k++) {
            newList2.add(k);
        }
        System.out.println("Lista główna ma wielkość: " + newList2.size());
        ArrayList oddList = ext2.exterminate(newList2);
        System.out.println("Metoda zwraca listę o wielkości " + oddList.size());
    }
}