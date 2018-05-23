package com.jhlm.ctcipractice.ctcipractice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BubbleSortTests {

	@Test
	public void BubbleSort_Integer_Swap_ArrayEquals() {
        BubbleSort sort = new BubbleSort();
        Integer[] test = new Integer[] { 3, 2, 1 };

        sort.swap(0, 2, test);

        assertArrayEquals(new Integer[]{ 1, 2, 3 }, test);
    }
    
    @Test
	public void BubbleSort_Integer_Sort_ArrayEquals() {
        BubbleSort sort = new BubbleSort();
        Integer[] test = new Integer[] { 3, 2, 1 };

        sort.sort(test);

        assertArrayEquals(new Integer[]{ 1, 2, 3 }, test);
	}
}
