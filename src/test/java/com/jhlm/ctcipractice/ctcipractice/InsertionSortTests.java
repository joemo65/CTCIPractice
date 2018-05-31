package com.jhlm.ctcipractice.ctcipractice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertionSortTests {

	@Test
	public void InsertionSort_insert_ArrayEquals() {
        Integer[] test = new Integer[] { 31, 41, 59, 26, 41, 58};
        InsertionSort sort = new InsertionSort(test);
        //sort.insert(4);

        assertArrayEquals(new Integer[]{ 26, 31, 41, 41, 58, 59}, test);
    }
}
