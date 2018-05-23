package com.jhlm.ctcipractice.ctcipractice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SortTests {

	@Test
	public void Sort_Swap_ArrayEquals() {
        Sort sort = new Sort();
        Integer[] test = new Integer[] { 3, 2, 1 };

        sort.swap(0, 2, test);

        assertArrayEquals(new Integer[]{ 1, 2, 3 }, test);
	}
}
