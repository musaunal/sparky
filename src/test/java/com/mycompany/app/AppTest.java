package com.mycompany.app;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;

public class AppTest extends TestCase{
    public void testFoundInFirst() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(0, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array1, array2 ,array3 ,array4));
    }

    public void testFoundInSecond() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 0, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array1, array2 ,array3 ,array4));
    }

    public void testFoundInThird() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 0, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array1, array2 ,array3 ,array4));
    }

    public void testFoundInLast() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 0));
      assertTrue(new App().search(array1, array2 ,array3 ,array4));
    }

    public void testNotFound() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array1, array2 ,array3 ,array4));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array1 = new ArrayList<>();
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array1, array2 ,array3 ,array4));
    }

    public void testNull() {
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(null, array2 ,array3 ,array4));
    }
    public void testNull2() {
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array2, null, array3 ,array4));
    }
    public void testNull3() {
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array2, array3, null, array4));
    }
    public void testNull4() {
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array2 ,array3 ,array4 ,null));
    }
}
